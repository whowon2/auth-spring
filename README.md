# Project Name

This project demonstrates how to build and run a Java Spring Boot application with Docker, connecting to a PostgreSQL database. It also includes a PgAdmin instance for database management.

## Prerequisites

- Docker and Docker Compose installed on your machine
- Maven for building the project (if building manually)

## Project Structure

- **Dockerfile**: Defines how to build the Spring Boot application in a Docker container.
- **docker-compose.yml**: Defines the services (PostgreSQL, PgAdmin, and the Spring Boot application) for the environment.
- **Spring Boot Application**: A Java-based REST API packaged as a `.jar` file.

## Running the Project

### 1. Clone the Repository

Clone the repository to your local machine.

```bash
git clone https://github.com/yourusername/your-repository.git
cd your-repository
