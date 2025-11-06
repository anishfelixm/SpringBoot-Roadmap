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
How do we initialize the variables?<br>
Is String a reference variable or primitive data type?<br>

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

## Conditionals

There's several ways to run specific code snippets based of conditions that maybe true or false.

[Practice Code](./src/Conditionals.java)

How to create a if..else if..else block?<br>
When to use the switch statement?<br>
What happens if we miss the "break" condition in switch block?<br>
Give the truth tables of the three logical operators?


## Loops

Loops are used to run code snippets till the final condition is reached.

[Practice Code](./src/Loops.java)

What is the difference between "while" loop and "do..while" loop?<br>
Which are the conditions required for a "for" loop to function?<br>

## Arrays

Arrays are used to store multiple values of the same data type in a single variable.
E.g:
> String[] cars = {"Camaro",  "Tesla", "Ferrari"};

[Practice Code](./src/Arrays.java)

How can we create an array without initializing the values?<br>
How to get the second element in an array of size 3?<br>
How do we iterate over a multi-dimensional array?<br>

## Wrapper Classes

Wrapper classes provides a way to use primitive data types as reference data tyes (i.e Objects since they are passed as reference i.e their address is passed). This gives us several methods we can use. Also they can be used with Collections (like ArrayList). Java does automatic conversion of data type between primitive type and Wrapper class.
E.g:
> Integer a = 99;

[Practice Code](./src/WrapperClasses.java)

Which are the Wrapper classes for the primitive data types?<br>
What is autoboxing and unboxing?<br>

## ArrayList

Arraylist is a collection. It's a type of resizable array. It's present in java.util. Elements can be dynamically added during runtime but they can only store reference data types.
The for-each loop, also called enhanced for loop is a traversing technique to iterate over a collection like array. It's more readable and has less steps.
E.g:
> ArrayList<Integer> ranks = new ArrayList<Integer>();

[Practice Code](./src/ArrayListClass.java)

Why use ArrayLists when there's arrays present in Java?<br>
How do we iterate over an ArrayList 1) using normal for loop & 2) using for-each loop?<br>
List the most important and simple methods of ArrayLists?

## Methods

Methods are a block of code that's executed whenever they are called.
Overloaded methods are methods sharing same name but different types (or number) of parameters.
E.g: Main method.

[Practice Code](./src/Methods.java)

How to declare a method?<br>
What happens if we call a non-static method from a static method?<br>
What's the difference between arguments and parameters?<br>
Why do we need to specify the return type of method?<br>
How do we recognise the scope of a local variable?<br>
How does the ccode decide which overloaded method to choose?

---

### Checkpoint Code

1. [Hello World program](./src/HelloWorld.java)
2. [Sum of 2 Numbers Method](./src/SumOfTwoNumbers.java)
