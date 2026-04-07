# Java
🎓 Student Grade & Status System
Java · Object-Oriented Programming

📌 Description
A Java application that manages student academic records. The system stores each student's grades, automatically calculates their average, and determines their academic status (Pass / Fail) based on predefined criteria.
Built entirely with core Java OOP principles — no external libraries or frameworks required.

📂 Project Structure
Java/
│
├── Grade And Status System For Students/
│   └── *.java          # All source files
└── README.md

🏗️ OOP Design
The system is built around three core OOP concepts:
Encapsulation
Each student's data (name, grades, status) is encapsulated inside a dedicated class. Fields are private and accessed only through methods — no direct access from outside the class.
Classes
Separate classes handle distinct responsibilities — student data, grade logic, and status determination are not mixed in a single file.
ArrayLists
Student records are stored in ArrayList<Student> for dynamic, flexible management — no fixed array size, supports any number of students at runtime.

⚙️ Features

Add new student records dynamically
Store multiple grades per student
Automatic average grade calculation
Automatic Pass / Fail status determination
Display full student report (name, grades, average, status)


🔢 Status Logic
Average ≥ passing grade → Status: PASS ✅
Average <  passing grade → Status: FAIL ❌

▶️ How to Run
Requirements: Java JDK 8 or higher
bash# Compile
javac "Grade And Status System For Students"/*.java

# Run
java -cp "Grade And Status System For Students" Main
Or open the project in IntelliJ IDEA / Eclipse and run Main.java directly.

💻 Technologies
LanguageJavaParadigmObject-Oriented ProgrammingData StructureArrayListJDK8+
