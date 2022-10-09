# Spring-Boot-API-
A basic spring boot API running on AWS Elastic Beanstalk, using MySQL RDS for the database.


### To connect using Postman -> 

  ###### POST to -> http://springbootrdsapi-env.eba-p4iu338r.us-east-1.elasticbeanstalk.com/car
    
  {
      "name":"Car Name",
      "price":180000
  }


  ###### GET to -> http://springbootrdsapi-env.eba-p4iu338r.us-east-1.elasticbeanstalk.com/car
  
   -> Gets all the cars in the DB
   
  ###### GET to -> http://springbootrdsapi-env.eba-p4iu338r.us-east-1.elasticbeanstalk.com/1 
  
   -> Gets the car where id = 1
