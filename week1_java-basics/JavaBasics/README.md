# Java Basics

---

## Java JDK and JVM

JDK stands for Java Development Kit. JVM stands for Java Virtual Machine. It compiles the Java source code (.java files) to a bytecode format (.class format). This bytecode is run on the JDK which hosts the JVM. JVM is cross platform i.e. doesn't depend on the system while the JDK will be machine specific. So Java code will be same irrespective of machine and its the job of JDK to run the bytecode in a way that works on the system.

---

## Variables

They are placeholders for values that they hold and they behave as per their defined rules.
E.g: 
> String name = "Hello, world";

What are the data types of variables?
What is the difference between reference and primitive data types?
How do we initialize the variables?

## Input and Output

Scanner is a module provided for Input operations by the Java.util package. We can do different types of input operations using this.
E.g:
> Scanner scanner = new Scanner(System.in);
> String name = scanner.nextLine();

How to create a scanner object?
How to do input of different data types?
What happens if you do a scanner.nextLine() after a scanner.nextInt()?

## Classes And Objects
