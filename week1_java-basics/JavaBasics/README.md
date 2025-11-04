# Java Basics

---

## Java JDK and JVM

JDK stands for Java Development Kit. JVM stands for Java Virtual Machine. It compiles the Java source code (.java files) to a bytecode format (.class format). This bytecode is run on the JDK which hosts the JVM. JVM is cross platform i.e. doesn't depend on the system while the JDK will be machine specific. So Java code will be same irrespective of machine and its the job of JDK to run the bytecode in a way that works on the system.

---

## Variables

They are placeholders for values that they hold and they behave as per their defined rules.
E.g: 
> String name = "Hello, world";

[Practice Code](./src/Variables.java)

What are the data types of variables?<br>
What is the difference between reference and primitive data types?<br>
How do we initialize the variables?

## Input

Scanner is a module provided for Input operations by the Java.util package. We can do different types of input operations using this.
E.g:
> Scanner scanner = new Scanner(System.in);
> String name = scanner.nextLine();

[Practice Code](./src/InputAndOutput.java)

How to create a scanner object?<br>
How to do input of different data types?<br>
What happens if you do a scanner.nextLine() after a scanner.nextInt()?

## Simple GUI (Optional topic)

JOptionPane is a package that allows us to make simple GUI (Graphical User Interface) applications. It is present in javax.swing library. A simple prompt popup and message popup can be created easily.

[Practice Code](./src/SimpleGUI.java)

How to create a simple input prompt box?<br>
How to deal with input of data belonging to different data types?<br>
How to display a message box?

## Some Useful Modules

Math module has several methods related to mathematical operations like sqrt, abs, ceil, floor, etc.<br>
[Practice Code](./src/MathClass.java)<br>
Random Module has several methods related to random data generation for different data types.<br>
[Practice Code](./src/RandomClass.java)

## Classes And Objects
