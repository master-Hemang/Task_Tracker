# Task_Tracker


## 🚀 Tech Stack

* **Framework:** Java 17, Spring Boot 3.x
* **Database:** PostgreSQL / Spring Data JPA
* **Security:** Spring Security & JWT (JSON Web Tokens)
* **Build Tool:** Maven
* **Documentation:** Swagger/OpenAPI 3.0
* **Extensions:** WebSockets (Real-time notifications), OpenAI API (GenAI task descriptions)

## ✨ Features

### User Authentication & Management
* Secure user registration and login.
* Password hashing using BCrypt.
* JWT-based stateless session management and route authorization.

### Task Management
* **CRUD Operations:** Create, read, update, and delete tasks.
* **Search & Filter:** Find tasks by title/description keywords or filter by status (`OPEN`, `COMPLETED`).
* **AI Integration:** Auto-generate detailed task descriptions using Generative AI based on short user prompts.

### Team Collaboration
* Create and join teams/projects.
* Assign tasks to specific team members.
* Add comments and upload file attachments to specific tasks.
* **Real-Time Updates:** WebSocket integration to push instant notifications when a user is assigned a new task.

## 🛠️ Project Setup & Installation

### Prerequisites
* Java Development Kit (JDK) 17 or higher
* Maven 3.6+
* PostgreSQL installed and running locally (or via Docker)
