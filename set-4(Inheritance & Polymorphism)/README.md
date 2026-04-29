# SET-4 (Inheritance in JAVA)

## Compilation Guide

To create all class files, run:

```bash
javac *.java
```

---

## Practical 13: Shape Inheritance

### Problem Statement:
Design a base class Shape with two double data members d1 and d2 to store dimensions. Include a method getData(double d1, double d2) to initialize these dimensions. Create two derived classes, Triangle and Rectangle, which inherit from Shape. Each derived class should have its own method to calculate its specific area.

### Sample Output:

```text
Area of Triangle: 25.0
Area of Rectangle: 50.0
```

---

## Practical 14: Bank Account Inheritance

### Problem Statement:
Define a base class BankAccount with common attributes like accountNumber, accountHolderName, and balance. Then, define two subclasses: SavingAccount and FixedDepositAccount, which inherit from BankAccount. Implement basic operations like openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The SavingAccount should include a calculateInterest() method specific to savings accounts, and FixedDepositAccount should have a maturityAmount() method considering fixed deposit terms.

### Sample Output:

```text
Saving Account
Deposited Amount: 5000.0
Withdrawn Amount: 2000.0
Current Balance: 53000.0
Interest: 2650.0

Fixed Deposit Account
Current Balance: 100000.0
Maturity Amount: 121000.0
```

---

## Practical 15: Method Overriding using Employee and Manager

### Problem Statement:
Create a base class named Employee that contains a method displayDetails() which prints general employee details such as name and department. Create a subclass Manager that inherits from Employee and overrides the displayDetails() method to include additional information such as the manager's team size or project name. Demonstrate runtime method overriding in the main method.

### Sample Output:

```text
Employee Details
Name: Raj
Department: Computer

Manager Details
Name: Raj
Department: Computer
Team Size: 10
Project Name: Bank Management System
```
