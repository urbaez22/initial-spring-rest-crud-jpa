# *** Read Me First ***
#=============================

# Getting Started

First of all, you have to connect to your database and execute the script

	src/main/resources/db/create_user_database.sql

That way your DB user and Database will exist when you try to migrate with Flyway.

### Flyway
Flyway is practically the standard in Java to manage DB migration, which allows to have the physical model versioned in your SCM.

* Execute migrations with:

	$ mvn flyway:migrate

* Reset (clean) the DB to migrate again:

	$ mvn flyway:clean
IMPORTANT: only to be executed in Development, and sometimes in Testing, NEVER EVER IN PRODUCTION.


### Reference Documentation

* To package the application skipping unit tests:

	$ mvn clean package -Dmaven.test.skip=true

* To run the application in your local environment (default):

	$ mvn spring-boot:run
If you need to recompile everything again, use clean:

	$ mvn clean spring-boot:run
Or:
	
	$ mvn clean package



