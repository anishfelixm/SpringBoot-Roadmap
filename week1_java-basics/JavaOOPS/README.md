# Java OOPS Concepts

---

## Classes and Objects

A Class is a template for creating objects. It has all properties and methods required for that Object to exist. An Object is an instance of a class and it contains attributes and methods.
A constructor is a special methood that's called when an object is instantiated. This gives us the liberty to create custom objects.

[Practice Code](./src/ClassesAndObjects.java)

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
> 