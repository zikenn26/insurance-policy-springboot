#  Insurance Policy Management System (Spring Boot)

## 📝 Project Overview
This is a **Spring Boot backend** application for managing insurance policies, clients, and claims.  
It provides **REST API endpoints** for performing CRUD operations on **Clients, Policies, and Claims**.

---

## 📁 Features
✅ Create, Read, Update, and Delete (CRUD) operations  
✅ REST API with Spring Boot  
✅ MySQL Database Integration  
✅ Spring Data JPA for persistence  
✅ Swagger UI for API Documentation

---

## 🔧 Technologies Used
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA (Hibernate)**
- **MySQL Database**
- **Maven**

---

## 🔌 API Endpoints

### 📜 **Insurance Policy Controller**
| Method | Endpoint | Description |
|--------|-----------------------------|-----------------------------|
| `PUT` | `/api/updateInsurancePolicy/{insurancePolicyId}` | Update an existing insurance policy |
| `POST` | `/api/saveInsurancePolicy` | Save a new insurance policy |
| `GET` | `/api/getByInsurancePolicyId/{insurancePolicyId}` | Get policy by ID |
| `GET` | `/api/displayAllPolicy` | Get all policies |
| `DELETE` | `/api/deleteInsurancePolicy/{policyId}` | Delete a policy |

### 👤 **Client Controller**
| Method | Endpoint | Description |
|--------|-----------------------------|-----------------------------|
| `PUT` | `/api/updateClient/{clientId}` | Update client details |
| `POST` | `/api/saveClient/{policyId}` | Save a new client under a policy |
| `GET` | `/api/getClientById/{clientId}` | Get client by ID |
| `GET` | `/api/displayAllClient` | Get all clients |
| `DELETE` | `/api/deleteClient/{clientId}` | Delete a client |

### 📄 **Claim Controller**
| Method | Endpoint | Description |
|--------|-----------------------------|-----------------------------|
| `PUT` | `/api/updateClaim/{claimId}` | Update claim details |
| `POST` | `/api/saveClaim/{policyId}` | Save a new claim under a policy |
| `GET` | `/api/getByClaimId/{claimId}` | Get claim by ID |
| `GET` | `/api/displayAllClaim` | Get all claims |
| `DELETE` | `/api/deleteClaim/{claimId}` | Delete a claim |

---

## 🛠️ How to Run the Project

### 1️⃣ **Clone the Repository**
```sh
git clone https://github.com/zikenn26/insurance-policy-springboot.git
cd insurance-policy-springboot
```

### 2️⃣ Configure MySQL Database
- Create a database named spring_boot_insurance_management_platform.
- Update application.properties with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring_boot_insurance_management_platform
spring.datasource.username=root
spring.datasource.password=yourpassword
```

### 3️⃣ Run the Spring Boot Application
```sh
mvn spring-boot:run
```

### 4️⃣ Test the API
- Open Swagger UI:
```bash
http://localhost:8080/swagger-ui.html
```
- Use Postman or cURL to test API endpoints.

---

### 📞 Contact
If you have any questions, feel free to reach out!

#### ✉️ Email: gulnayak1206@gmail.com

#### 🔗 GitHub: https://github.com/zikenn26
