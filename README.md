
# Spring Boot Rest API

This is a simple REST API project using Spring Boot, JPA, Hibernate and MySQL. It allows you to perform CRUD operations on a user entity with the following fields:

- id
- title
- description


## How to run

To run this project, you need to have Java 8 or higher and MySQL installed on your machine. You also need to create a database named `springbootrestapi` and update the `application.properties` file with your MySQL username and password.

Then, you can clone this repository and run the following commands in the terminal:

```bash
cd Spring_Boot_Rest_API
mvn clean install
java -jar target/spring-boot-rest-api-0.0.1-SNAPSHOT.jar
```

Alternatively, you can import this project into your preferred IDE and run it from there.

## How to use

Once the application is running, you can use any REST client tool (such as Postman) to test the API endpoints. The base URL is `http://localhost:8080/courses`.

The available endpoints are:

- `GET /courses` : Get all courses
- `GET courses/{id}` : Get course by id
- `POST /courses` : Create a new course
- `PUT courses/{id}` : Update an existing course by id
- `DELETE courses/{id}` : Delete a course by id

The request and response body format is JSON. For example, to create a new user, you can send a POST request to `http://localhost:8080/api/users` with the following body:

```json
{
    "id": 145,
    "title": "Angular course",
    "description": "complete angular tutorial"
}
```

And you will get a response like this:

```json
{
    "id": 145,
    "title": "Angular course",
    "description": "complete angular tutorial"
}
```

## How to contribute

If you want to contribute to this project, you can fork this repository and make your changes. Then, you can create a pull request and I will review it.

Please follow the code style and conventions of this project and write clear commit messages.

Thank you for your interest in this project! 😊
