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