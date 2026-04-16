# 📚 Book Management System (Spring Boot REST API)

This is a simple backend project built using Spring Boot that performs CRUD (Create, Read, Update, Delete) operations on books. The project uses MySQL database and REST APIs. No frontend or Swagger UI is included. APIs are tested using Postman.

---

## 🚀 Features
- Add a new book
- Get all books
- Get book by ID
- Update book details
- Delete book
- RESTful APIs
- MySQL database integration

---

## 🛠️ Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs
- Postman (for testing)

---

## 📡 API Endpoints

###  Create Book
- Method: POST  
- URL: /books  
- Description: Add a new book to database  

---

### Get All Books
- Method: GET  
- URL: /books  
- Description: Fetch all books from database  

---

### Get Book by ID
- Method: GET  
- URL: /books/{id}  
- Description: Fetch single book using ID  

---

### Update Book
- Method: PUT  
- URL: /books/{id}  
- Description: Update existing book details  

---

### Delete Book
- Method: DELETE  
- URL: /books/{id}  
- Description: Delete book from database  

---

## Database Configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
spring.jpa.hibernate.ddl-auto=update

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
