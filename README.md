
# Spring Boot Form App

This is a simple Spring Boot web application that registers users via a form and stores the data in an Amazon RDS MySQL database. The application is containerized using Docker and ready for deployment using Kubernetes and AWS CodeBuild.

## Features

- Spring Boot Web + Thymeleaf for UI
- Form fields: Name, Email, Phone, Gender, Weight, Height, Address
- Connects to MySQL (Amazon RDS compatible)
- Dockerfile for containerization
- Kubernetes manifests (Deployment + Service)
- buildspec.yaml for AWS CodeBuild
- .gitignore included

## Prerequisites

- Java 17+
- Maven 3+
- Docker
- AWS CLI (for CodeBuild)
- kubectl (for Kubernetes)

## Getting Started

### 1. Clone and Build

```bash
git clone https://github.com/Rohitkumar44/springboot-form-app.git
cd springboot-form-app
./mvnw clean package
```

### 2. Run Locally

```bash
./mvnw spring-boot:run
```

### 3. Build Docker Image

```bash
docker build -t springboot-form-app .
```

### 4. Deploy to Kubernetes

```bash
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml
```

## License

This project is licensed under the MIT License.
