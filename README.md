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

💼 Author

Ripudaman Singh





1. Create folder:

screenshots/


2. Add images:
- Register success
- Login (token)
- Transaction
- Summary


## 📸 Demo Screenshots

![Register](screenshots/register.png)
![Login](screenshots/login.png)
![Summary](screenshots/summary.png)


I have developed a backend system for financial data processing with role-based access control.

The project includes:
- JWT-based authentication
- Role-based authorization
- Financial transaction management (CRUD)
- Filtering and dashboard summary APIs

The system is structured using clean architecture principles and focuses on maintainability and scalability.

GitHub Repository:
https://github.com/RajpootRipu321/finance-dashboard-backend




