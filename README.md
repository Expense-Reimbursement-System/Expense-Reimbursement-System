* Expense-Reimbursement-System

The Expense Reimbursement System (ERS) will manage the process of reimbursing employees for expenses incurred while on company time. 
All employees in the company can login and submit requests for reimbursement and view their past tickets and pending requests. 
Finance managers can log in and view all reimbursement requests and past history for all employees in the company. 
Finance managers are authorized to approve and deny requests for expense reimbursement.

* Technical Requirements
The back-end system shall use JDBC to connect to a Postgres database. The middle tier shall use Javalin technology for dynamic Web 
application development. The front-end view shall use HTML/CSS/JavaScript to make an application that can call server-side 
components in a generally RESTful manner. The middle tier shall follow proper layered architecture, and have EITHER 10 JUnit tests 
or 10 logs. Webpages shall be styled to be functional and readable.


* Stretch Goals (if you'd like to use this technology):

Postgres Database shall be hosted remotely on an AWS RDS.
Employees must select the type of reimbursement as: LODGING, TRAVEL, FOOD, or OTHER.


* Environment / Technologies
Java
JDBC
SQL
CSS/HTML
Bootstrap
JavaScript
JUnit
Log4J
