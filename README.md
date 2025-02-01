Here is the English translation of your text:

---

# 🚀 Approval System

Approval System is a microservice-based Spring Boot project designed for internal approval and authorization management. The project manages authorization and approval processes through independent microservices. Thanks to the gateway structure, all services can be accessed through a single port.

![Approval System Diagram](images/mm.jpg)


## 📁 Project Structure

The project consists of the following microservices:

- **User Service** - "User management."
- **Role Service** - "Roles and permissions."
- **Permission Service** - "Permission definitions and control."
- **Group Service** - "User groups and relationships."
- **Organization Service** - "Organization hierarchy management."
- **Gateway Service** - "API Gateway providing access through a single port."

![Approval System Diagram](images/shema.jpg)


## 🛠 Technologies and Tools

- **Spring Boot** - "Microservice development."
- **Spring Cloud Gateway** - "API Gateway."
- **PostgreSQL** - "Database management."
- **Maven** - "Project and dependency management."
- **REST API** - "Communication between services."

## ⚙️ Setup

1. Clone the project:
```bash
git clone <repo-link>
```
2. Install dependencies:
```bash
mvn clean install
```
3. Create your PostgreSQL database:
```bash
CREATE DATABASE approvaldb;  // "approvaldb" is the name of our database. You can change it if needed, but remember to update the corresponding settings in the `../src/main/resources/application.properties` file within the services.
```
4. Start the microservices:
```bash
mvn spring-boot:run
```
Each microservice runs on its own port.
5. Start the Gateway service:
```bash
cd gateway
mvn spring-boot:run
```
The Gateway is accessible by default at [http://localhost:8080](http://localhost:8080).


## 📝 Usage

1. Adding users and roles:
```
POST /user
POST /role
```
2. Authorization checks and organization hierarchy adjustments can be made.


## 📘 API Documentation

Postman can be used to test the API endpoints of all services.


## 🤝 Contributing

This project is a simple system developed to understand microservice architecture, and it may contain errors. If you'd like to contribute, please create an issue or send a pull request.

---

Let me know if you need any refinements! 🚀
