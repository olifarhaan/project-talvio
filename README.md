# Talvio - Job Application Management System

## Overview
Talvio is a microservices-based job application management system built with Spring Boot and Spring Cloud. It helps manage job postings, applications, and user profiles efficiently.

## Microservices Architecture

### Service Registry (Port: 8761)
- Eureka Server for service discovery
- Central registry for all microservices

### Gateway Service (Port: 8080)
- Entry point for all client requests
- Routes requests to appropriate microservices
- Handles load balancing

### Core Microservices
1. **User Service** (Port: 8085)
   - Manages user accounts and authentication
   - Handles user profile management

2. **Job Service** (Port: 8083)
   - Manages job postings
   - Handles job search and filtering

3. **Job Seeker Service** (Port: 8084)
   - Manages job seeker profiles
   - Handles resume and skill management

4. **Application Service** (Port: 8082)
   - Manages job applications
   - Tracks application status

## Technical Stack
- Java 21
- Spring Boot 3.4.1
- Spring Cloud 2024.0.0
- MySQL Database
- Gradle
- Spring Cloud Netflix Eureka
- Spring Cloud Gateway

## Getting Started

### Prerequisites
- Java 21
- MySQL
- Gradle

### Setup
1. Clone the repository
2. Configure MySQL database (default credentials in application.properties)
3. Start services in order:
   ```bash
   # 1. Start Service Registry
   cd service_registry
   ./gradlew bootRun

   # 2. Start Gateway
   cd ../gateway
   ./gradlew bootRun

   # 3. Start other services
   cd ../user
   ./gradlew bootRun
   # Repeat for other services
   ```

### Service URLs
- Eureka Dashboard: http://localhost:8761
- Gateway: http://localhost:8080
- User Service: http://localhost:8085
- Job Service: http://localhost:8083
- Job Seeker Service: http://localhost:8084
- Application Service: http://localhost:8082


## License

This project is licensed under the MIT License - see the LICENSE[https://github.com/talvio/talvio/blob/main/LICENSE] file for details.

If you have any questions or need assistance, please contact me at [alifarhan231087@gmail.com](mailto:alifarhan231087@gmail.com) or message me on [LinkedIn](https://www.linkedin.com/in/olifarhaan/).
