-- This Script is create to hold the user users/users roles/reimbursement type and
-- reimbursement status to Expense Reimbursement System (ERS)  from P1 project
-- Data Definition Language (DDL): create, alter, truncate, drop.


-- Create ERS_User_role table will hold revelant information to the users
CREATE TABLE ers_user_roles (
ers_user_roles_id serial PRIMARY KEY,
user_role VARCHAR (25) -- varchar2, which is a non-SQL-standard type. In PostgreSQL, use type varchar or text instead.

);

-- Create ERS_User table will hold revelant information to the users
CREATE TABLE ers_users (
ers_users_id serial PRIMARY KEY,
ers_username VARCHAR (50) UNIQUE, 
ers_password VARCHAR (50),
ers_first_name VARCHAR (100),
ers_second_name VARCHAR (100),
ers_email VARCHAR (150) UNIQUE, -- UNIQUE maintains the uniqueness of the data correctly
                                -- ensures that all values in a column are different.
ers_user_roles_id_fk int REFERENCES ers_user_roles(ers_user_roles_id)

);

SELECT * FROM ers_users;

-- Create ERS_Reimbuserment_status table will hold revelant information to the users
CREATE TABLE ers_reimbursement_status(
reimb_status_id serial PRIMARY KEY,
reimb_status VARCHAR (10)

);

-- Create ERS_Reimbursement_type table will hold revelant information to the users
-- This table have values insert.
CREATE TABLE ers_reimbursement_type(
reimb_type_id serial PRIMARY KEY,
reimb_type VARCHAR (10)


);

-- Create ERS_Reimbursement table will hold revelant information to the users
-- this table have the type one to many depends of the soluction
-- Both relationships will occurs when multiple records 
-- in one table are related to multiple records in another table. 
CREATE TABLE ers_reimbursement (
reimb_id serial PRIMARY KEY,
reimb_aumount NUMERIC,
reimb_submitted text, 
reimb_author NUMERIC ,
reimb_status_id NUMERIC, 
reimb_type_id NUMERIC,
reimb_status_id_fk int REFERENCES ers_reimbursement_status(reimb_status_id),
reimb_type_id_fk int REFERENCES ers_reimbursement_type(reimb_type_id),
ers_author_fk int REFERENCES ers_users(ers_users_id)

);
-- Create Employeess table will hold revelant information to the users
CREATE TABLE employees (
	employee_id serial PRIMARY KEY,
	first_name TEXT,
	last_name TEXT,
	ers_user_roles_id_fk int REFERENCES ers_user_roles(ers_user_roles_id), --foreign key: establishes a relationship between the tables
    reimb_status_id_fk int REFERENCES ers_reimbursement_status(reimb_status_id),  --foreign key: establishes a relationship between the tables
	reimb_type_id_fk int REFERENCES ers_reimbursement_type(reimb_type_id)
    );

-- Drop table ers_user_roles need delete information
DROP TABLE ers_user_roles;
DROP TABLE ers_users;
DROP TABLE ers_reimbursement;
DROP TABLE ers_reimbursement_type;
DROP TABLE ers_reimbursement_status;
DROP TABLE employees;

-- INSERT infor in table reimbursement type (the employee can choose their reimbursement)
INSERT INTO ers_reimbursement_type (reimb_type) 
VALUES ('Lodging'),
       ('Traver'),
       ('Food'),
       ('Others');
       SELECT * FROM ers_reimbursement_type;

-- INSERT data into users_roles table 
INSERT INTO ers_user_roles (user_role)
VALUES ('Manager'),
       ('Cashier'),
       ('Accountant'),
       ('Customer Service');
 
       SELECT * FROM ers_user_roles;


-- INSERT data into users table 
INSERT INTO ers_users (ers_username, ers_password, ers_first_name, ers_second_name, ers_email, ers_user_roles_id_fk)
VALUES ('mar','mar','Marlin','Sanc','mar123@revature.net',1),
       ('c@l', 'c@l', 'Carlos', 'Sams', 'sams123@revature.net',2),
       ('val', 'v@l', 'Valeria', 'Lopez', 'lop23@revature.net', 3),
       ('sam', 'sam', 'Samuel', 'Gomez', 'gom3@revature.net', 4);
      
      SELECT * FROM ers_users; 
      

 -- INSERT data into reimbursement_status table
 INSERT INTO ers_reimbursement_status (reimb_status) 
 VALUES ('Pending'),
        ('Approved'),
        ('Denied');
        SELECT * FROM ers_reimbursement_status;
       
 -- INSERT data into ers_reimbursement table
 INSERT INTO ers_reimbursement (reimb_aumount, reimb_submitted, reimb_author, reimb_status_id, reimb_type_id, reimb_status_id_fk, reimb_type_id_fk, ers_author_fk)
  VALUES ('20.50', '2020-05-20', 1, 2, 1, 1, 1, 2),
         ('98.30', '2019-12-02', 2, 3, 4, 1, 2, 2),
         ('10.50', '2022-02-02', 3, 4, 3, 2, 4, 1),
         ('2.50', '2016-12-3', 4, 1, 2, 3, 3, 4);
 
         SELECT * FROM ers_reimbursement;
 
 -- INSERT data into Employee table 
 INSERT INTO employees (first_name, last_name, ers_user_roles_id_fk, reimb_status_id_fk, reimb_type_id_fk)  
 VALUES ('Marlin', 'Sanc', 1, 2, 3 ),
        ('Carlos', 'Sams', 2, 1, 2 ),
        ('Valeria', 'Lopez', 4, 3, 4),
        ('Samuel', 'Gomez', 3, 2, 2);
       
       SELECT * FROM employees;
 
 
 