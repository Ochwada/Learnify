# 🧑‍🎓 Learnify – Simplified Learning Platform

Learnify is a lightweight, modular online learning platform designed to enhance the learning experience through 
simplicity and motivation. Built using a microservices architecture, each core feature is independently developed, 
ensuring flexibility, scalability, and ease of maintenance.

## Key Features:
- **Course Browsing Service**: Allows users to explore a curated list of available courses, making it easy to find 
relevant learning materials. 
- **Motivational Quotes Service**: Displays a random motivational quote to inspire users each time they interact with 
the platform.

Whether you're just starting out or exploring new skills, Learnify keeps you focused and encouraged on your learning 
journey. The modular design also makes the platform ideal for iterative development and future feature integration.

### 🔬 Microservices to Implement in Version 1

### 1️⃣ `course-service`
| Feature   | Description                                          |
|-----------|------------------------------------------------------|
| Purpose   | Stores and returns a list of available courses       |
| Tech      | Spring Boot, Spring Web, Spring Data JPA, PostgreSQL |
| Endpoints | `GET /courses`, `POST /courses`                      |

### 2️⃣ `motivation-service`
| Feature  | Description                                           |
|----------|-------------------------------------------------------|
| Purpose  | Returns a random motivational quote from a public API |
| Tech     | Spring Boot, WebClient, No database                   |
| Endpoint | `GET /motivation`                                     |


##  📂 Learnify Project Structure

```yaml
Learnify/
│
├── .env                               # Centralized config (used by Docker or Dotenv loader)
├── docker-compose.yml                # Orchestrates all microservices and dependencies
├── README.md                         # Project overview, setup, and usage
├── tech-stack.md                     # ← Technologies used in the project
├── .gitignore                        # Ignored files
│
├── learnify-course-service/
│   ├── Dockerfile
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/ochwada/learnify/course/
│   │   │   │   ├── controller/
│   │   │   │   ├── dto/
│   │   │   │   ├── model/
│   │   │   │   ├── repository/
│   │   │   │   ├── service/
│   │   │   │   └── LearnifyCourseServiceApplication.java
│   │   │   └── resources/application.properties
│   │   └── test/
│   └── .gitignore
│
├── learnify-motivation-service/
│   ├── Dockerfile
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/ochwada/learnify/motivation/
│   │   │   │   ├── controller/
│   │   │   │   ├── model/
│   │   │   │   ├── service/
│   │   │   │   └── LearnifyMotivationServiceApplication.java
│   │   │   └── resources/application.properties
│   │   └── test/
│   └── .gitignore
│
└── shared-libs/                      # (Optional) Common DTOs/utilities for reuse

```

## 🧰 Tech Stack

###  Backend
- **Java 17**
- **Spring Boot 3.5.4**
- **Spring Web** – REST APIs
- **Spring Data JPA** – ORM for PostgreSQL
- **Lombok** – Reduces boilerplate
- **Validation** – Input constraints via JSR-380
- **Dotenv Java** – Load `.env` variables in development

### Database
- **PostgreSQL** – Relational DB (course and motivation services)
- **MongoDB (planned)** – For geospatial or memory-related services

###  Deployment
- **Docker** – Containerized each microservice
- **Docker Compose** – Manage and orchestrate services
- *(optional: Kubernetes in the future)*

###  Testing
- **JUnit 5**
- **Spring Boot Test Starter**

###   Future Integrations
- **Spring Cloud Gateway** – API routing
- **Spring Config Server** – Centralized configs
- **Eureka (Netflix OSS)** – Service discovery
- **OAuth2 / JWT** – Authentication

### `pom.xml` Dependencies

| Dependency                       | Purpose                                                |
|----------------------------------|--------------------------------------------------------|
| `spring-boot-starter-data-jpa`   | Enables interaction with PostgreSQL using JPA          |
| `spring-boot-starter-validation` | Enables validation of DTOs and forms using annotations |
| `spring-boot-starter-web`        | Adds Spring MVC, REST controllers, and embedded Tomcat |
| `spring-boot-devtools`           | Improves local development via auto-restart            |
| `postgresql`                     | JDBC driver to connect to PostgreSQL                   |
| `lombok`                         | Generates boilerplate code with annotations            |
| `spring-boot-starter-test`       | Includes JUnit, Mockito, and Spring Test               |
| `dotenv-java`                    | Loads variables from `.env` for dev/test environments  |
