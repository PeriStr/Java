# 🎓 Student Grade & Status System

A comprehensive Java application for managing student academic records across different educational institutions (Gymnasium and Lyceum). This project demonstrates core Object-Oriented Programming (OOP) principles including encapsulation, inheritance, polymorphism, and abstract classes.

---

## 📋 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [OOP Architecture](#oop-architecture)
- [Status Logic](#status-logic)
- [Installation & Setup](#installation--setup)
- [Usage](#usage)
- [Technologies](#technologies)

---

## 📝 Overview

This system allows educational administrators to:
- **Manage student records** for both Gymnasium (lower secondary) and Lyceum (upper secondary) students
- **Track academic performance** by storing and calculating grade averages
- **Determine student status** (Pass/Fail) based on automatic calculations
- **Search and delete** student records efficiently using registration numbers

Built entirely with **core Java OOP principles** — no external libraries or frameworks required.

---

## ✨ Features

- ✅ **Dynamic Student Management** — Add students from different school types (Gymnasium & Lyceum)
- ✅ **Multi-Grade Tracking** — Store multiple grades per student
- ✅ **Automatic Average Calculation** — Grades are automatically averaged
- ✅ **Automatic Status Determination** — Pass/Fail status based on average grade
- ✅ **Detailed Student Reports** — Display name, surname, school, class, grades, average, and status
- ✅ **Student Search** — Find students by registration number
- ✅ **Student Deletion** — Remove student records with registration number verification
- ✅ **Filtered Display** — View all Gymnasium or Lyceum students separately
- ✅ **Interactive Menu** — User-friendly command-line interface

---

## 🏗️ Project Structure

```
Java/
│
├── Grade And Status System For Students/
│   ├── Pupil.java                    # Abstract base class for all students
│   ├── PupilGymnasium.java           # Gymnasium student implementation
│   ├── PupilLyceum.java              # Lyceum student implementation
│   ├── PupilList.java                # Student collection manager
│   └── Exersize.java                 # Main program & user interface
│
└── README.md                          # This file
```

### Class Descriptions

| Class | Purpose |
|-------|---------|
| **Pupil** | Abstract base class defining common properties (name, surname, registration number) and abstract methods for grade management |
| **PupilGymnasium** | Concrete implementation for Gymnasium students with grade calculation logic |
| **PupilLyceum** | Concrete implementation for Lyceum students with specific passing criteria |
| **PupilList** | Collection manager using `ArrayList<Pupil>` for storing and managing student records |
| **Exersize** | Main program entry point with interactive menu-driven interface |

---

## 🔧 OOP Architecture

### 1. **Encapsulation**
- All student data (name, surname, registration number, grades) are **private** fields
- Data is accessed only through **public methods** (getters/setters)
- Grade storage and calculations are hidden from external access

```java
private String name;
private String surname;
private String registrationNumber;

public String getName() { return name; }
public void setName() { /* input handling */ }
```

### 2. **Inheritance & Polymorphism**
- `Pupil` is an **abstract base class** with common attributes
- `PupilGymnasium` and `PupilLyceum` **inherit** from `Pupil`
- Both override abstract methods: `setGrade()` and `getAverageGrade()`
- Implementation differences allow different passing criteria for different school types

```java
public abstract class Pupil { ... }
public class PupilGymnasium extends Pupil { ... }
public class PupilLyceum extends Pupil { ... }
```

### 3. **Collections & Dynamic Storage**
- Students stored in `ArrayList<Pupil>` for flexible, dynamic management
- Supports unlimited number of student records at runtime
- No fixed array size limitations

```java
ArrayList<Pupil> pupilList = new ArrayList<>();
```

### 4. **Abstract Methods**
- `setGrade()` — Each school type implements grade input differently
- `getAverageGrade()` — Each school type calculates averages based on different criteria

---

## 🔢 Status Logic

The system automatically determines Pass/Fail status based on average grade:

```
Average ≥ Passing Grade → Status: PASS ✅
Average <  Passing Grade → Status: FAIL ❌
```

**Passing grade thresholds:**
- **Gymnasium**: Average ≥ 6.0 = PASS
- **Lyceum**: Average ≥ 5.0 = PASS

---

## 🚀 Installation & Setup

### Prerequisites
- **Java Development Kit (JDK) 8 or higher**
- Command-line terminal or IDE (IntelliJ IDEA, Eclipse, VS Code with Java extension)

### Option 1: Command Line

```bash
# Navigate to project directory
cd Java

# Compile all Java files
javac "Grade And Status System For Students"/*.java

# Run the program
java -cp "Grade And Status System For Students" Exersize
```

### Option 2: IDE (IntelliJ IDEA / Eclipse)

1. Open the project folder in your IDE
2. Right-click on `Exersize.java`
3. Select **Run** or **Run as Java Application**

---

## 💻 Usage

### Main Menu Options

When you run the program, you'll see this menu:

```
Menu:
a) Insert a gymnasium student
b) Insert a lyceum student
c) Print the status of all gymnasium students
d) Print the status of all lyceum students
e) Searching of a student using his registration number and print his status
f) Delete student after search him with registration number
choice:
```

### Workflow Example

**1. Adding a Gymnasium Student (Option a)**
```
Insert a gymnasium student:
Enter the name of the student: John
Enter the surname of the student: Doe
Enter the registration number of the student: GYM001
Enter the school: Central Gymnasium
Enter the classroom: A1
Enter grades (space separated): 7 8 9 7.5
Student added successfully!
```

**2. Viewing All Gymnasium Students (Option c)**
- Displays all stored Gymnasium students with their complete profiles

**3. Searching a Student (Option e)**
- Enter registration number to find and display a specific student's information

**4. Deleting a Student (Option f)**
- Enter registration number to remove a student from the system

---

## 🛠️ Technologies

| Technology | Details |
|-----------|---------|
| **Language** | Java |
| **Paradigm** | Object-Oriented Programming (OOP) |
| **Data Structures** | ArrayList (Collections Framework) |
| **JDK** | 8 or higher |
| **Build** | Command-line compilation |
| **UI** | Console-based interactive menu |

---

## 📚 Learning Outcomes

This project is an excellent resource for learning:
- ✓ Abstract classes and inheritance hierarchies
- ✓ Polymorphism and method overriding
- ✓ Encapsulation and access modifiers
- ✓ Collections (ArrayList) and iteration
- ✓ User input handling with Scanner
- ✓ String operations and data validation
- ✓ Object-oriented design patterns
- ✓ Menu-driven application design

---

## 📄 License

This project is part of an educational exercise in Object-Oriented Programming with Java.

---

## 🤝 Contributing

This is an educational project. Feel free to fork, study, and improve the code!

---

**Happy Coding! 🚀**
