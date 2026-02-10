Got it 👍
You want the **GitHub-ready `README.md` (pure Markdown)** that renders cleanly on GitHub.

Below is **exactly what you should paste into `README.md`** in your repo — no extra formatting, no explanations.

---

```md
# Java Task – Simple Item Management REST API

A simple Spring Boot backend application that implements a RESTful API for managing items using **in-memory storage**.  
This project was created as a **sample task** for a Freelance Java Developer opportunity.

---

## 🚀 Live Demo

**Base URL**
```

[https://javatasktest.onrender.com](https://javatasktest.onrender.com)

````

---

## 📌 Features

- Add a new item
- Get an item by ID
- Input validation using Jakarta Validation
- In-memory data storage (ArrayList)
- No database required
- Dockerized and publicly hosted

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- REST API
- Maven
- Docker
- Render (Hosting)

---

## 📦 Item Model

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}
````

---

## 🔗 API Endpoints

### ➕ Add a New Item

**Endpoint**

```
POST /api/items/add
```

**Full URL**

```
https://javatasktest.onrender.com/api/items/add
```

**Request Body**

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}
```

**Responses**

* `201 CREATED` – Item added successfully
* `400 BAD REQUEST` – Validation error

---

### 🔍 Get Item by ID

**Endpoint**

```
GET /api/items/{id}
```

**Example**

```
https://javatasktest.onrender.com/api/items/1
```

**Responses**

* `200 OK` – Item found
* `404 NOT FOUND` – Item not found

---

## ✅ Input Validation

* `id` – required
* `name` – required, cannot be blank
* `description` – required, cannot be blank

Validation is handled using `@Valid` and Jakarta Validation annotations.

---

## ▶️ Run Locally

### Prerequisites

* Java 17+
* Maven

### Steps

```bash
git clone https://github.com/AjayRay230/JavaTaskTest.git
cd JavaTaskTest
./mvnw spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

---

## 🐳 Docker Support

The project uses a **multi-stage Docker build**:

* Builds the application inside Docker using Maven
* Runs using a lightweight JRE image

This ensures smooth deployment on cloud platforms like Render.

---

## ℹ️ Notes

* Data is stored **in memory**, so it resets on application restart
* No authentication or database is used, as per task requirements
* Designed to be simple and easy to evaluate

