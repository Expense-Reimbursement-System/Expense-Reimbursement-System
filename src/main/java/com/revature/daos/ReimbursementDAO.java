package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.models.Reimbursement;
import com.revature.utils.ConnectionUtil;

public class ReimbursementDAO {
	
	
	
       public ArrayList<Reimbursement> getAllReimbursement( ){
		
		try(Connection conn = ConnectionUtil.getConnection()){
			
			//a String that will represent our SQL statement
			String sql = "select * from ers_reimbursement;";
			
			//a Statement object to execute our query 
			Statement s = conn.createStatement();
			
			//execute our query into a ResultSet object, which will hold all the data 
			//executeQuery() is what actually queries the database! Then we put the records into a ResultSet
			ResultSet rs = s.executeQuery(sql);
			
			//Instantiate an ArrayList to put our Employee objects into
			ArrayList<Reimbursement> reimbursementList = new ArrayList<>();
			
			//use rs.next() in a while loop to create Employee objects and populate our ArrayList with them.
			//remember, the ResultSet is what's holding our data. We need to turn it into something Java can read (objects)
			while(rs.next()) {
				Reimbursement reimb = new Reimbursement(
						rs.getInt("reimb_id"),
						rs.getFloat("reimb_aumount"),
						rs.getString("reimb_submitted"),
						rs.getInt("reimb_author"),
						rs.getInt("reimb_status_id"),
						rs.getInt("reimb_type_id"),
						rs.getInt("reimb_status_id_fk"),
						rs.getInt("reimb_status_id_fk"),
						rs.getInt("ers_author_fk")			
						);
				   
				   reimbursementList.add(reimb);
				}
			
				return reimbursementList; 
				
			} catch (SQLException e) {
			System.out.println("Something went wrong selecting employees by ID");
			e.printStackTrace();
			}
			return null;
		}
			
       
       public void updateReimbStatus(int reimb_id, int reimb_status_id, int reimb_type_id) {
    	   try (Connection conn = ConnectionUtil.getConnection()){
    		   //write out our SQL UPDATE command
    		   String sql = "update ers_reimbursement set reimb_status_id =?, reimb_type_id =? where reimb_id = ? ";
    		   //create our PreparedStatement
   			    PreparedStatement ps = conn.prepareStatement(sql);
   			    //input the appropriate values into our PreparedStatement
    		    ps.setInt(1, reimb_status_id);
    		    ps.setInt(2, reimb_type_id);
    		    ps.setInt(3, reimb_id);
    		    
    			//execute the update!!
    			ps.executeUpdate();
    		   
    	   } catch (SQLException e) {
    		   System.out.println("Couldn't update :(");
   			   e.printStackTrace();
		}
    	   
       }
       
       
          public void insertReimb(Reimbursement reimb, int reimb_type_id ) {
        	  try(Connection conn = ConnectionUtil.getConnection()){  
        		//write out our SQL UPDATE command
       		    String sql = "insert into ers_reimbursement (reimb_aumont, ers_author_fk, reimb_type_id)" + "values (?,?,?);";
       		    //Instantiate a PreparedStatement to fill in the variables of our initial SQL String
       			PreparedStatement ps = conn.prepareStatement(sql);
       			
       	    	//fill in the values of our variables using ps.setXYZ()
       			ps.setFloat(1,reimb.getReimb_aumount());
       			ps.setInt(2, reimb.getErs_author_fk());
       			ps.setInt(3, reimb_type_id);
       		    //Execute the Update!! (the method is called executeUpdate(), but it's for INSERTS, UPDATES, and DELETES)
       			ps.executeUpdate();

       			
        	  } catch (SQLException e) {
        		  System.out.println("Something went wrong inserting Employee!");
      			e.printStackTrace();
			}
          }
          
          public void removeReimb(Reimbursement reimb, int reimb_id ) {
        	   try(Connection conn = ConnectionUtil.getConnection()){
        	    //write out our SQL UPDATE command
     		    String sql = "delete from ers_reimbursement where reimb_id =?;";
     		    //instantiate our PreparedStatement to fill in the variable
     		     PreparedStatement ps = conn.prepareStatement(sql);
    			//fill in the values of our variables using ps.setXYZ()
    			ps.setInt(1, reimb.getReimb_id());
    			//ps.executeUpdate() to send our delete to the DB
    			ps.executeUpdate();
    			
    		
    		
          } catch (SQLException e) {
  			System.out.println("YOU CAN'T FIRE ME MY FATHER WILL SUE");
  			e.printStackTrace();
  		  }
  		
    }
        	  
          
}
