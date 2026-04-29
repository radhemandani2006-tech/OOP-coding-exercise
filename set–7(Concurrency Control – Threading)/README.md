# SET-7 (Multithreading in JAVA)

## Compilation Guide

To create all class files, run:

```bash
javac *.java
```

---

## Practical 23: Two Threads with Different Time Intervals

### Problem Statement:
Write a Java program that creates two threads:
- First thread prints numbers from 1 to 10 at the interval of 1 second.
- Second thread prints numbers from 11 to 20 at the interval of 500 ms.

Run both threads and display the output.

### Sample Output:

```text
Thread 1: 1
Thread 2: 11
Thread 2: 12
Thread 1: 2
Thread 2: 13
...
```

---

## Practical 24: Sequential Thread Execution

### Problem Statement:
Write a Java program where:
- Thread T1 prints numbers from 1 to 100
- Thread T2 prints numbers from 101 to 200
- Thread T3 prints numbers from 201 to 300

Initiate execution of all three threads but ensure that numbers are printed sequentially.

### Sample Output:

```text
1
2
3
...
100
101
102
...
200
201
202
...
300
```

---

## Practical 25: Synchronized Multiplication Tables

### Problem Statement:
Write a Java program where two threads print multiplication tables (for example, Table of 5 and Table of 7). Use a synchronized method so that table outputs do not mix and remain consistent.

### Sample Output:

```text
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
...
7 x 10 = 70
```
