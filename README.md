# Nextneo System Project
Nextneo System Project

Java project with project with SpringBoot 2.x, Swagger

## Requirements

- JDK 11
- MariaDB 10
    or
- Docker

## Info

Swagger: `/system/swagger-ui.html`


### Web

#### /system

### API Services

#### GET - /user/findById/{id}

##### response
```json
{
"id": 1,
"login": "hayek",
"name": "Friedrich Hayek",
"password": "password"
}
```

#### GET - /user/findByLogin/{login}

##### response
```json
{
"id": 1,
"login": "hayek",
"name": "Friedrich Hayek",
"password": "password"
}
```