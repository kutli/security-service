# Security service

Microservice used for authentication & refresh token. It also has the implementation for authorization purposes.
It is currently using JWT for authentication.


## Run in Local:
The app will start in local server in port 8080.
You must run the eureka server(discovery service) so the security service can be registered.

Also you will need to configure the following env vars:
```
DB_NAME=db_example
DB_URL=localhost
DB_PORT=3306
DB_USER=root
DB_PASSWORD=


JTW_SECRET=secret
JWT_EXPIRATION_TIME=600000
```

#### Env var tip
If you are using IntelliJ IDEA you can configure the plugin EnvFile to use a file with env variables </br>
EnvFile  GitHub: https://github.com/Ashald/EnvFile




## ENV VARS that must be configured in server:
DB_NAME: Database name<br />
DB_PASSWORD: Database password<br />
DB_PORT: Database port<br />
DB_URL: Database url<br />
DB_USER: Database user<br />
JAWSDB_URL: jaws database url - configure if using jawsdb<br />

EUREKA_HOSTNAME: security service hostname<br />
EUREKA_URL: Eureka server(discovery service) url with user and password<br />

JWT_EXPIRATION_TIME: jwt expiration time in milliseconds<br />
JWT_SECRET: jwt secret<br />

SPRING_PASSWORD: spring password<br />
SPRING_USER: spring user<br />


### Example of env vars in heroku
```aidl
DB_NAME=test
DB_PASSWORD=pwd
DB_PORT=3306
DB_URL=xyz.us-east-1.rds.amazonaws.com
DB_USER=username
JAWSDB_URL=configure if using jawsdb

EUREKA_HOSTNAME=security-service.herokuapp.com
EUREKA_URL=https://user:password@eureka-server.herokuapp.com

JWT_EXPIRATION_TIME=300000
JWT_SECRET=secret

SPRING_PASSWORD=pwd
SPRING_USER=user
```

