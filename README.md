# SpringJavaTests

A Spring Boot application for managing test cases through a REST API. I will be continuously adding information and features to this project.
## API Reference

#### Get all items

```http
  GET /api/testcases
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Create a test case
```http
  POST /api/testcases
```
| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name` | `string` | **Required**. Your API key |
| `description` | `string` |  Description of the test case |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Name of the test case |
## Example Request

To create a new test case, you can use the following curl command:

```bash
 curl -X POST http://localhost:8080/api/testcases \
-H "Content-Type: application/json" \
-d '{"name": "Valid Test Case", "description": "A test case description."}'
```
or
```bash
curl -X POST http://localhost:8080/api/testcases -H "Content-Type: application/json" -d "{\"name\": \"\", \"description\": \"A test case without a name.\"}"
```
## Running Tests

```bash
./gradlew test
```
## Configuration

The default configuration is located in src/main/resources/application.properties:
```
spring.application.name=SpringJavaTests
# Settings H2
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# Settings JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Database Configuration
By default, the application uses an H2 in-memory database. To configure a different database (e.g., PostgreSQL), update the **application.properties**:
```
# =======================# Settings PostgreSQL #==========================
# spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
# .datasource.driverClassName=org.postgresql.Driver
# pring.datasource.username=your_username
# spring.datasource.password=your_password
```
