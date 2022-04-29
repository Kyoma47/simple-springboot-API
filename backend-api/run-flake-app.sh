# show maven version :
sh ./mvnw -v 

# download/install dependencies
# & generate mvn artifact (0.0.1-SNAPSHOT)
sh ./mvnw install  

# run the jar file :
java -jar target/backend-api-0.0.1-SNAPSHOT.jar 