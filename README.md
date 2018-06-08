# StockOrder
Two services; SOAP and REST
The project simulates a stock order process through SOAP and REST services. 
The application was run locally (kindly see the recording file). 

We tried to deploy our implemented services in AWS and Google App Engine servers. However, 
we faced some problems in both of them. - In Google App Engine, HTTP communication must occur 
through either the URL Fetch Service or java.net.URL class, and that does not apply for 
SOAP/REST services. In AWS, we bought an instance with an tomcat installed inside. However, 
it seem that tomcat has issues and could not be solved. 
The deployment link of the AWS instance (which has a mistake in the tomcat server) is: http://ec2-54-234-105-100.compute-1.amazonaws.com. (That deployment is not successfully done in that link as discussed above).

We have implemented the following services:
 A REST service to add and get different stock instruments in the database.
 A SOAP service to exchange money into different currencies.
We have chosen Java as a programming language, and the Control Flow Dependency and the Data Flow Transfers were done using JOpera.
