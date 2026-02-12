# Student Data Structures Management System

This project is a Java console application that demonstrates the practical application of **Stack** and **Queue** data structures. Instead of using the built-in Java Collections Framework, this project implements these structures manually using a custom **Linked Node** architecture.



## 🚀 Key Features
- **Manual Data Structure Implementation:** Full implementation of `Stack` (LIFO) and `Queue` (FIFO) using a custom `Node` class.
- **Dynamic Data Transfer:** - Transfer entire Stacks to Queues and vice-versa while maintaining or reversing order logic.
  - **Conditional Transfer:** Logic to filter and move only students with an **even age**.
- **Student Entity Management:** A robust `Student` class handling attributes like Name, Gender, ID, and Age.
- **Interactive Console Menu:** A nested menu system for testing various edge cases (empty states, clearing memory, etc.).

## 📂 File Overview
- **`Student.java`**: The core data model with encapsulation and display logic.
- **`Node.java`**: The link mechanism that holds `Student` data and references the next object.
- **`Stack.java`**: Implements `push`, `pop`, `top`, and specialized transfer methods (`StoQ`, `EvenStoQ`).
- **`Queue.java`**: Implements `enqueue`, `dequeue`, `front`, and specialized transfer methods (`QtoS`, `EvenQtoS`).
- **`ProjectMain.java`**: The entry point for the application, featuring a user-friendly command-line interface.

## 🛠️ Installation & Usage

### Prerequisites
- Java Development Kit (JDK) 8 or higher.

## 📂 Run Instructions
1. Open the project in any Java IDE (NetBeans, IntelliJ, or VS Code).
2. Compile all files in the `projectmain` package.
3. Run `ProjectMain.java` to start the interactive menu.
