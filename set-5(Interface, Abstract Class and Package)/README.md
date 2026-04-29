# SET-5 (Interfaces, Abstract Classes and Packages in JAVA)

## Compilation Guide

To create all class files, run:

```bash
javac *.java
```

---

## Practical 16: Interface Classify

### Problem Statement:
Given an interface `Classify` with a method `String getDivision(double average)`. Implement this method in a class `Result` such that it returns `"First Division"` if the average is 60 or more.

### Sample Output:

```text
Average: 75.0
Division: First Division
```

---

## Practical 17: Multiple Interfaces

### Problem Statement:
Write a Java program using two interfaces:
- `Exam` with method `boolean isPassed(int mark)`
- `Classify` with method `String getDivision(double average)`

Create a class `Result` that implements both interfaces and demonstrates both methods.

### Sample Output:

```text
Mark: 70
Passed: true
Average: 68.5
Division: First Division
```

---

## Practical 18: Abstract Class Vehicle

### Problem Statement:
Write a Java program to create an abstract class `Vehicle` with:
- `fuelType()`
- `noOfWheels()`

Create subclasses:
- `Car`
- `Bike`

Display fuel type and number of wheels.

### Sample Output:

```text
Car
Fuel Type: Petrol/Diesel
Number of Wheels: 4

Bike
Fuel Type: Petrol
Number of Wheels: 2
```

---

## Practical 19: Student Marksheet using Packages

### Problem Statement:
Write a Java program using packages to generate a mark sheet for students.

Create:
- package `student` containing class `Student`
- package `exam` containing class `Result`

The `Result` class should extend `Student` and display the student's mark sheet with total and average marks.

### Sample Output:

```text
Enter Roll Number : 101
Enter Student Name : Radhe
Enter Marks of Subject 1 : 85
Enter Marks of Subject 2 : 90
Enter Marks of Subject 3 : 80

----- STUDENT MARKSHEET -----
Roll Number : 101
Student Name : Radhe
Marks in Subject 1 : 85
Marks in Subject 2 : 90
Marks in Subject 3 : 80
Total Marks : 255
Average Marks : 85.0
```
