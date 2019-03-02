# Nextneo System Project
Nextneo System Project

Java project with project with SpringBoot 2.x

## Requirements

- JDK 11
- MySQL 8
- Embedded Tomcat 9

## Info

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