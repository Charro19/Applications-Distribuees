# Connecting PostgreSQL with Java using JDBC

## Overview
This guide walks you through the process of establishing a connection between Java and PostgreSQL using JDBC.

## Prerequisites
- *IDE:* IntelliJ IDEA Ultimate  
- *JDBC Driver:* Version 42.7.5  
- *JVM:* OpenJDK 23.0.1  
- *PostgreSQL:* Version 17.2  

---

## Steps to Set Up JDBC Connection

### 1. Install the PostgreSQL JDBC Driver
Download the latest PostgreSQL JDBC driver from the official site:  
[🔗 JDBC Driver Download](https://jdbc.postgresql.org/download/)

### 2. Add JDBC Driver to IntelliJ IDEA
1. Open *IntelliJ IDEA Ultimate*.
2. Go to *File* → *Project Structure* → *Libraries*.
3. Click *Add New Library* and locate the downloaded JDBC driver.
4. Save and apply the changes.

### 3. Create a Table in PostgreSQL
Ensure your database is set up, and create a table as needed. Example:

sql
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);


### 4. Establish Connection in Java
Use the DriverManager class to connect to PostgreSQL:

java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://your_host:your_port/your_database";
        String user = "your_username";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connected to PostgreSQL successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}


Replace your_host, your_port, your_database, your_username, and your_password with your actual database credentials.

### 5. Run the Java Program
1. Compile the program in IntelliJ IDEA.
2. Run the main method to test the database connection.
3. If successful, you should see: *"Connected to PostgreSQL successfully!"*
