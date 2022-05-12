package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.models.Users;
import com.revature.utils.ConnectionUtil;

public class UsersDAO {
	
	
		//This method will return true in the case of successful login, otherwise it will return false
		public Users login(String ers_username, String ers_password) {
			 
			try(Connection conn = ConnectionUtil.getConnection()){
				
				     //String will connect put send(inside) of the database
				     String sql = "select * from ers_users where ers_username = ? and ers_password = ?;";
				     //Instantiate a PreparedStatement to fill in the variables of our initial SQL String
				     PreparedStatement ps = conn.prepareStatement(sql);

				     ps.setString(1, ers_username);
				     ps.setString(2, ers_password);
				     
				     //executeQuery() is what actually queries the database! Then we put the records into a ResultSet
				     ResultSet rs = ps.executeQuery();
         
					
				     while(rs.next()) {
						 Users user = new Users(
								 rs.getInt("ers_users_id"),
								 rs.getString("ers_username"),
								 rs.getString("ers_password"),
								 rs.getString("ers_first_name"),
								 rs.getString("ers_second_name"),
								 rs.getString("ers_email"),
								 rs.getInt("ers_user_roles_id_fk")
								 
								 );		
						 return user;
					}
			
			} catch (SQLException e) {
				System.out.println("Something happened inserting Your Information !");
				e.printStackTrace();}
			
			return null;

		}


            public void getUsersById(int ers_users_id) {
            	
            	//use a try-with-resources block to open a DB connection
        		try(Connection conn = ConnectionUtil.getConnection()){
        		//this String has a variable/parameter, the role_id we're searching for is determined at runtime
        		String sql = "select * from ers_users where ers_user_id =? and ers_first_name =? and ers_second_name =?"
        				+ " and ers_user_roles_id_fk = ?";
        		//we need a PreparedStatement object to fill in variables of our SQL query 
    			PreparedStatement ps = conn.prepareStatement(sql); //conn.prepareStatement() instead of createStatement()
    			
    			ps.setInt(1, ers_users_id); //the 1 is referring to the first variable (?) in our SQL String
    			
    			//Execute the query in a ResultSet object to hold our incoming data
    			ResultSet rs = ps.executeQuery();
    			
    			       while(rs.next()) {
    			    	   
    			    	   return;		
    			    	   
    			       }
  		
        			
        		} catch (SQLException e) {
        			System.out.println("Something happened inserting Your Information !");
					e.printStackTrace();
				}
            	
            	
				return;
            	
            }


		public ArrayList<Users> getUsers() {
			try(Connection conn = ConnectionUtil.getConnection()){
				// String that will represent our SQL statement
				String sql = "select * from ers_users;";
				
				Statement s = conn.createStatement();
				//execute our query into a ResultSet object, which will hold all the data 
				//executeQuery() is what actually queries the database! Then we put the records into a ResultSet
				ResultSet rs = s.executeQuery(sql);
				ArrayList<Users> userList = new ArrayList<>();
				
				while(rs.next()) {
					Users us = new Users(
							     rs.getInt("ers_users_id"),
								 rs.getString("ers_username"),
								 rs.getString("ers_password"),
								 rs.getString("ers_first_name"),
								 rs.getString("ers_second_name"),
								 rs.getString("ers_email"),
								 rs.getInt("ers_user_roles_id_fk"));
					//add the fully initialized Employee into the ArrayList
					userList.add(us);
				}
				
				return userList;
				
			} catch(SQLException e) {
				System.out.println("Something went wrong selecting all Users!");
				e.printStackTrace();
			}
		
			return null;
	
		} 
		

		
		public Users getUserByName( int user_users_id, String ers_first_name, String ers_second_name) {
			try (Connection conn = ConnectionUtil.getConnection()){
				// String that will represent our SQL statement
				String sql = "select * from ers_users where ers_user_id=? and ers_first_name=? and ers_second_name=?";
				//we need a PreparedStatement object to fill in variables of our SQL query 
				PreparedStatement ps = conn.prepareStatement(sql); //conn.prepareStatement() instead of createStatement()
				ps.setInt(1, user_users_id);
				ps.setString(2, ers_first_name);
				ps.setString(3, ers_second_name);
				
				//Execute our statement and put the results into a ResultSet object
				//we use the executeQuery() method from the Statement object, and give it our sql string to execute
				ResultSet rs = ps.executeQuery();
				       while(rs.next()) {
				    	   Users us = new Users(
								     rs.getInt("ers_users_id"),
									 rs.getString("ers_username"),
									 rs.getString("ers_password"),
									 rs.getString("ers_first_name"),
									 rs.getString("ers_second_name"),
									 rs.getString("ers_email"),
									 rs.getInt("ers_user_roles_id_fk"));
				       }
				
				       return new Users();
				       
			} catch (SQLException e) {
				System.out.println("Something went wrong selecting all Users!");
				e.printStackTrace();
			}
			return null;
			
		}
		


}
	
	

