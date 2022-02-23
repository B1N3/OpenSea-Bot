# Description

This project is intended for those who want to automate their NFT buying, selling, etc., on OpenSea.
You will need to obtain a API key from OpenSea to use this service. Each user needs his/hers own API key.
This server instance can run locally on your machine at home or you can use our provided URL (opensea.b1n3.net)
where the most recent version of this server will run

[Note: If you choose to use our instance, your API key will be stored in our database!].


Web app and mobile apps are on the road map


# Deployment and Maintenance for local instances

Before development, maintenance and deployment, make sure you meet all requirements specified bellow:

* Use Java JDK version 11
* When opening project, always rebuild dependencies
* Deployment to server is ONLY possible over SSH with YubiKey authentication
* Connection to database must be set in application.properties in src/main/resources folder

Your application.properties should look like this:

```
server.port=<your-desired-run-port>

spring.datasource.url=jdbc:postgresql://<your-hostname>:<your-port>/<your-databse>
spring.datasource.username=<your-usernamwe>
spring.datasource.password=<your-password>
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults = false
spring.jpa.hibernate.ddl-auto = update
spring.datasource.initialization-mode=always
spring.datasource.tomcat.test-while-idle = true
spring.datasource.tomcat.validation-query= SELECT 1
server.forward-headers-strategy=native
```


Best regards, OpenSea-Bot dev team (B.G., T.A.Č.)

- - -
# Documentation
## API Authorization

API accepts 2 types of requests. Requests that need to be authorized and public requests. Authorization is handled via a Barer token (JWT). For the request to be successfully authorized, it must contain a header with key value of "Authorization", and value of "Barer " + JWT.

Header example:

```
"Authorization": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJz ... i2RiScp_z9yn78i0jkPZJt2DSxQ"
```

## How to obtain JWT token

To obtain JWT token, you must be a registered user. See bellow how to register. To obtain a new JWT token, authentication with username and password is required.

Request example:
```
POST: https://opensea.b1n3.net/api/v1/authenticate
BODY:
{
    "username": "<your-username>",
    "password": "<your-password>" 
}
```
Response:
```json
{
    "username": "<your-username>",
    "name": "<your-name>",
    "id": "e8d68143-d59b-41b6-8e76-eb8e6499ffff",
    "permissions": "{permissions:[PROFILE_PERMISSION, MY_ASSETS_PERMISSION]}",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ ... 7m8__VAi9X7CoNPvfbm25UaRE_rh0frwdHGQ"
}
```
Once you obtain your JWT, it will be valid for 7 days.


## How to register

To register, follow the example bellow:

```
POST: https://opensea.b1n3.net/api/v1/register
BODY:
{
    "firstName": "<your-name>",
    "lastName": "<your-last-name>",
    "username": "<your-username>",
    "password": "<your-password>"
    "open-sea-api-key": "<your-api-key>"
}
```
Response:
```text
Successfully registered new user
```
Once successfully registered, you can obtain a JWT toke, to access API endpoints.


## Test your JWT

For now, only one API endpoint is supported. You can use it, to verify if your app is working propperly.
Example call for endpoint:
```
GET: https://opensea.b1n3.net/api/v1/assets/get-my
```
Response:
```text
assets array
```


## Other

### Sessions
Server keeps sessions for each generated JWT token, therefore it is good practice to destroy sessions when a logout event occurs in client app.
Session destroy example:
```
DELETE: https://opensea.b1n3.net/api/v1/session/destroy
```
Response:
```
Session destroyed.
```


### Activity
Server keeps a log of user activity.