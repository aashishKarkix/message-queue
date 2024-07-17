# Spring Boot Messaging Demo

This Spring Boot application demonstrates message queuing using Kafka, NATS, and RabbitMQ.

## Pre-requisites

Before running the application, ensure you have:

- Java Development Kit (JDK) 17 or higher installed.
- Apache Kafka 3.7.1 and RabbitMQ installed and configured.
- Docker installed (for running NATS server).

## Setup and Configuration

### Kafka Server

#### Start Kafka Server:
```bash
/usr/local/bin/kafka-3.7.1-src/bin/kafka-server-start.sh /usr/local/bin/kafka-3.7.1-src/config/server.properties
```

### RabbitMQ Server

#### Start RabbitMQ Server:
```bash
sudo service rabbitmq-server start
```
#### Check RabbitMQ Server Status:
```bash
sudo systemctl status rabbitmq-server
```

### NATS Server
#### Start NATS Server using Docker:
```bash
docker run -p 4222:4222 -ti nats
```

## Running the Application
#### Clone the repository and navigate into it:
```bash
git clone <repository-url>
cd spring-boot-messaging-demo

```



## Endpoints

### RabbitMQ Endpoint:

- **Method:** `GET`
- **URL:** `http://localhost:8080/rabbit?message=HelloRabbit`
- **Description:** Sends a message to RabbitMQ.

### Kafka Endpoint:

- **Method:** `GET`
- **URL:** `http://localhost:8080/kafka?message=HelloKafka`
- **Description:** Sends a message to Kafka.

### NATS Endpoint:

- **Method:** `GET`
- **URL:** `http://localhost:8080/nats?message=HelloNats`
- **Description:** Sends a message to NATS.






