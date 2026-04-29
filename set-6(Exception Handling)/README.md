# SET-6 (Exception Handling in JAVA)

## Compilation Guide

To create all class files, run:

```bash
javac *.java
```

---

## Practical 20: Exception Handling using Command-Line Arguments

### Problem Statement:
Take the value of denominator and numerator from the user using command-line arguments. Implement the concept of exception handling to manage all possible run-time errors.

### Sample Output:

```text
> java practical20 10 2
Result = 5
```

```text
> java practical20 10 0
Error: Division by zero is not allowed.
```

```text
> java practical20 10
Error: Please enter numerator and denominator.
```

```text
> java practical20 abc 2
Error: Please enter valid integer values.
```

---

## Practical 21: Voting Eligibility using Exception Handling

### Problem Statement:
Write a Java program to create a class VotingApp where:
- The method checkEligibility(int age) checks if a person is eligible to vote.
- If age < 18, explicitly throw the predefined exception IllegalArgumentException with the message:
  `"Age must be 18 or above to vote"`

Use try-catch-finally block to handle exceptions. The finally block should always print:
`"Validation process completed"`

### Sample Output:

```text
Exception: Age must be 18 or above to vote
Validation process completed
```

---

## Practical 22: Custom Exception - BookNotAvailableException

### Problem Statement:
Define a custom exception class BookNotAvailableException that extends Exception.

Create a class Library with:
- An instance variable availableBooks
- A method issueBook(int count)

If requested books are available:
- Reduce the number of books
- Display `"Book issued successfully"`

Otherwise:
- Throw BookNotAvailableException with the message:
  `"Requested books not available"`

### Sample Output:

```text
Book issued successfully
Exception: Requested books not available
```
