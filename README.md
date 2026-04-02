![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-green)




# 💰 Finance Dashboard Backend

## 🚀 Overview
This project is a backend system for managing financial records with role-based access control and dashboard analytics.

It demonstrates backend design, API structuring, business logic, and secure authentication using JWT.

---

## 🔧 Tech Stack
- Java + Spring Boot
- Spring Security
- JWT Authentication
- MySQL
- JPA (Hibernate)

---

## ✨ Features

### 🔐 Authentication & Authorization
- User Registration & Login
- JWT-based Authentication
- Role-based Access Control (USER / ADMIN)

### 💸 Financial Records
- Create, Read, Update, Delete transactions
- Fields: amount, type, category, date, note

### 📊 Dashboard APIs
- Total Income
- Total Expense
- Net Balance

### 🔍 Filtering
- Filter by type (INCOME / EXPENSE)
- Filter by category

### ⚠️ Validation & Error Handling
- Input validation using annotations
- Global exception handling

---

## 🧠 Design Decisions
- Used layered architecture (Controller → Service → Repository)
- Implemented role-based security using Spring Security
- Designed transaction model for flexible filtering and aggregation
- Summary APIs simulate real dashboard analytics

---

## 📌 Assumptions
- Roles simplified to USER and ADMIN
- Date stored as string for simplicity
- JWT validation can be extended further

---

## 📸 API DEMO

### 1️⃣ Register User
POST `/auth/register`

```json
{
  "name": "Ripu",
  "email": "ripu@gmail.com",
  "password": "12345"
}


2️⃣ Login

POST /auth/login

{
  "email": "ripu@gmail.com",
  "password": "12345"
}

3️⃣ Create Transaction

POST /transactions

{
  "amount": 5000,
  "type": "INCOME",
  "category": "Salary",
  "date": "2026-04-02",
  "note": "Monthly income"
}

4️⃣ Dashboard Summary

GET /transactions/summary

{
  "totalIncome": 5000,
  "totalExpense": 0,
  "balance": 5000
}

📁 Project Structure
controller/
service/
repository/
model/
security/
exception/

💰 Finance Dashboard Backend
🚀 Overview
This project is a backend system for managing financial records with role-based access control and dashboard analytics.

It demonstrates backend design, API structuring, business logic, and secure authentication using JWT.

🔧 Tech Stack
Java + Spring Boot
Spring Security
JWT Authentication
MySQL
JPA (Hibernate)
✨ Features
🔐 Authentication & Authorization
User Registration & Login
JWT-based Authentication
Role-based Access Control (USER / ADMIN)
💸 Financial Records
Create, Read, Update, Delete transactions
Fields: amount, type, category, date, note
📊 Dashboard APIs
Total Income
Total Expense
Net Balance
🔍 Filtering
Filter by type (INCOME / EXPENSE)
Filter by category
⚠️ Validation & Error Handling
Input validation using annotations
Global exception handling
🧠 Design Decisions
Used layered architecture (Controller → Service → Repository)
Implemented role-based security using Spring Security
Designed transaction model for flexible filtering and aggregation
Summary APIs simulate real dashboard analytics
📌 Assumptions
Roles simplified to USER and ADMIN
Date stored as string for simplicity
JWT validation can be extended further
📸 API DEMO
1️⃣ Register User
POST /auth/register

{
  "name": "Ripu",
  "email": "ripu@gmail.com",
  "password": "12345"
}


2️⃣ Login

POST /auth/login

{
  "email": "ripu@gmail.com",
  "password": "12345"
}

3️⃣ Create Transaction

POST /transactions

{
  "amount": 5000,
  "type": "INCOME",
  "category": "Salary",
  "date": "2026-04-02",
  "note": "Monthly income"
}

4️⃣ Dashboard Summary

GET /transactions/summary

{
  "totalIncome": 5000,
  "totalExpense": 0,
  "balance": 5000
}

📁 Project Structure
controller/
service/
repository/
model/
security/
exception/

## ▶️ How to Run

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the Spring Boot application
4. Use Postman to test APIs


## ⚠️ Error Handling

- Proper validation using annotations
- Meaningful error responses for invalid inputs
- Global exception handler for runtime errors

## 🚀 Future Improvements

- Complete JWT validation in filter
- Add pagination for transactions
- Store date as LocalDate instead of String
- Deploy backend to cloud (Render/AWS)

