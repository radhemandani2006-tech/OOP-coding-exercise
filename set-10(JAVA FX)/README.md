# SET-10 (JavaFX Programs)

## Compilation Guide

To compile JavaFX programs:

```bash
javac --module-path "path_to_javafx_lib" --add-modules javafx.controls *.java
```

To run:

```bash
java --module-path "path_to_javafx_lib" --add-modules javafx.controls practical33
```

---

## Practical 33: JavaFX Text Styling with Random Colors

### Problem Statement:
Write a JavaFX program that displays five Text nodes vertically. Each text should:
- Use Times New Roman font
- Bold + Italic style
- Font size 22 px
- Have random color and random opacity (0.3 to 1.0)
- Be centered with spacing between them

### Sample Output:
A window showing:
```
Text 1 (random color)
Text 2 (random color)
Text 3 (random color)
Text 4 (random color)
Text 5 (random color)
```

---

## Practical 34: Registration Form using JavaFX

### Problem Statement:
Design a registration form UI with:
- Roll No (numeric)
- Name
- Age (numeric)
- Email
- Submit button

Validation:
- Roll No and Age must be integers
- Email must contain @ and .

On success:
- Show confirmation alert
- Save data to file

On failure:
- Show error alert

### Sample Output:

Success Alert:
```
Registration Successful
Roll: 101
Name: Radhe
Age: 20
Email: test@gmail.com
```

Error Alert:
```
Roll No and Age must be integers
OR
Invalid Email Format
```

---

## Practical 35: JavaFX Bar Chart using Rectangle

### Problem Statement:
Write a JavaFX program that displays a bar chart using Rectangle shapes:

- Projects: 20% (Red)
- Quizzes: 10% (Blue)
- Midterm Exams: 30% (Green)
- Final Exam: 40% (Orange)

Requirements:
- Each bar should be proportional to percentage
- Each bar should have label
- Bars should be arranged horizontally using HBox

### Sample Output:
A bar chart window showing:

```
Projects   ██████ (20%)
Quizzes    ███    (10%)
Midterm    █████████ (30%)
Final      █████████████ (40%)
```
