# Java OOPS Concepts

---

## Classes and Objects

A Class is a template for creating objects. It has all properties and methods required for that Object to exist. An Object is an instance of a class and it contains attributes and methods.
A constructor is a special methood that's called when an object is instantiated. This gives us the liberty to create custom objects.

[Practice Code](./src/BasicClassConcepts/ClassesAndObjects.java)

How can we create a class with attributes and methods?<br>
How do we create objects of a particular class?<br>
Why do we need constructors?<br>
When do we need to use the "this" keyword? And Why?<br>
How can we create overloaded constructors?<br>
How to create an array of objects?<br>
Can an object be passed as a parameter to a method?

## Scope of a variable

Anything that's defined inside a method is called a Local variable or local object and is visible only to the method. Anything that's defined outside a method is called a global variable or global object and is visible to all part of the class.

What happens if we create an instance of a class (like Random) inside a method (like constructor)? Is Random available to the whole class?

---

> toString() is a special method that all objects inherit. It returns a string that "textually" represents the object. It can be used implicitly and explicitly.<br>

---

## static keyword

Static keyword is a modifier that can be applied to a variable, method or even a class. It ensured a single copy of the static part is maintained. Think of it as the Class (not the objects) "owns" the static member and the member is shared by all object instances created.

[Practice Code](./src/BasicClassConcepts/StaticMembers.java)

What happens when we change the value of a static member?<br>
Why do we use the class name and not the object name to access static member? What happens if we use the object name?>br>

## Inheritance

This is the process where one class acquires the attributes and methods of another class. The child class must "extend" the super/parent class to inherit its properties. The child classes can have their own individual methods and attributes.
Method overriding is when a method is defined in subclass which is already defined in parent class, so that the child class can have it's own implementation of the method.
Super is the keyword used to refer to the parent class.
E.g:
> public class car extends vehicle {}

[Practice Code](./src/InheritanceConcepts/Inheritance.java)

What is the syntax to inherit from another class?<br>
Why do we need method over-riding?<br>
Why do we use super keyword?<br>

---

## Checkpoint Code

1. [Car Class](./src/CheckPointCode/CarSourceFile.java)