# Java CI/CD Pipeline Using Jenkins and Docker

## Project Overview
This project demonstrates an automated CI/CD pipeline for a Java Spring Boot application using Jenkins and Docker.

Whenever code is pushed to GitHub, Jenkins automatically triggers the pipeline through a GitHub webhook.

## Tools and Technologies
- Java 17
- Maven
- Jenkins
- Docker
- Git and GitHub
- GitHub Webhook
- AWS EC2 (Amazon Linux 2023)

## Project Structure

- src/main - Java application source code
- src/test - Application test cases
- pom.xml - Maven configuration
- Dockerfile - Docker image creation instructions
- Jenkinsfile - Jenkins pipeline configuration
- README.md - Project documentation

## CI/CD Pipeline Stages

1. Checkout: Jenkins retrieves the source code from GitHub.
2. Build and Test: Maven builds the application and executes tests.
3. Docker Build: Jenkins creates a Docker image.
4. Deploy: Jenkins deploys the application inside a Docker container.

## GitHub Webhook

A GitHub webhook is configured to automatically trigger the Jenkins pipeline whenever new code is pushed to the main branch.

## Application Endpoints

Home:
http://<EC2-PUBLIC-IP>:8081/

Health:
http://<EC2-PUBLIC-IP>:8081/health

## Expected Results

- Maven build and tests successful.
- Docker image created successfully.
- Docker container running successfully.
- Application health check successful.
- Automatic Jenkins build triggered by GitHub push.

## Conclusion

Successfully implemented an automated Java CI/CD pipeline using Jenkins, Maven, Docker, GitHub, and AWS EC2.
