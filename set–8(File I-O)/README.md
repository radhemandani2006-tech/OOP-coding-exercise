# SET-8 (File Handling in JAVA)

## Compilation Guide

To create all class files, run:

```bash
javac *.java
```

---

## Practical 26: Count Characters, Words and Lines in a File

### Problem Statement:
Write a Java program that counts the number of characters, words, and lines in a file. Words are separated by whitespace characters. The file name should be passed as a command-line argument.

### Sample Output:

```text
> java practical26 sample.txt

Number of Lines: 3
Number of Words: 15
Number of Characters: 75
```

---

## Practical 27: Student Records File Handling

### Problem Statement:
Create a file named `students.txt`. Write at least three student records (roll number, name, marks) into the file. Read the file content and display all student records on the console. Handle exceptions like IOException properly using try-catch-finally.

### Sample Output:

```text
Student records written to file.

Student Records:
101 Radhe 85
102 Krishna 90
103 Mohan 78
```

---

## Practical 28: Read data.txt and Count File Details

### Problem Statement:
Write a Java program that reads a text file named `data.txt`. The program should count and display:
- Total number of lines
- Total number of words
- Total number of characters (excluding spaces and newline characters)

Use `FileReader` / `BufferedReader` for reading the file. Handle exceptions like `FileNotFoundException` and `IOException`.

### Sample Output:

```text
Total Lines: 4
Total Words: 20
Total Characters: 95
```
