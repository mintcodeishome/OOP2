# OOP2

OOP ASSIGNMENT
 
i. Object Modeling Techniques (OMT)
Object Modeling Techniques (OMT) is a method for visualizing and documenting an information system. It was developed by James Rumbaugh and other members of the Object Management Group (OMG). OMT is part of the broader Object-Oriented Analysis and Design (OOAD) methodology. It provides a set of graphical notation techniques for specifying, visualizing, and documenting the different aspects of a system.
ii. OOAD vs. OOP
Object-Oriented Analysis and Design (OOAD) is a methodology for analyzing and designing a system by visualizing it as a group of interacting objects. Object Analysis and Design (OOP) refer to the broader concepts of object-oriented programming where the focus is on implementing the design using object-oriented programming languages.
In summary, OOAD is concerned with understanding and designing a system using object-oriented concepts, while OOP is the actual implementation of the design using an object-oriented programming language.
iii. Main Goals of UML
Unified Modeling Language (UML) is a standard language for specifying, visualizing, and documenting the artifacts of software systems. The main goals of UML include:
Visual Modeling: UML provides a set of visual notations to represent different aspects of a system, making it easier to understand and communicate complex software designs.
Tool-Independent: UML is designed to be independent of specific programming languages and development processes. It can be used with various tools and methodologies.
iv. Advantages of Object-Oriented Programming (OOP)
Three advantages of using OOP to develop an information system:
Modularity: OOP promotes modularity by encapsulating data and behavior within objects. This makes it easier to understand, maintain, and update different parts of the system independently.
Reusability: Objects and classes can be reused in different parts of the system or even in other projects. This reduces development time and enhances code reliability.
Flexibility and Extensibility: OOP supports the creation of new classes that inherit properties and behavior from existing classes. This allows for the extension and modification of the system without affecting the existing code.
3 Terms in Object-Oriented Programming


 // a. Constructor method
// Constructor method is a special method used for initializing objects. It has the same name as the class and is called when an object is created.
 
class Person {
	String name;
 
	// Constructor method
	public Person(String personName) {
    	name = personName;
	}
 
	public void display() {
    	System.out.println("Person's name: " + name);
	}
}
 
// b. Object
// An object is an instance of a class. It represents a real-world entity and is created using the 'new' keyword.
 
public class ObjectExample {
	public static void main(String[] args) {
    	// Creating an object of the Person class
    	Person person1 = new Person("John");
 
    	// Accessing the object's method
    	person1.display();
	}
}
 
// c. Interface
// An interface is a collection of abstract methods. It provides a way to achieve abstraction in Java.
 
interface Shape {
	void draw();
}
 
class Circle implements Shape {
	@Override
	public void draw() {
    	System.out.println("Drawing a circle");
	}
}
 
// d. Polymorphism
// Polymorphism allows objects of different types to be treated as objects of a common type. It can be achieved through method overloading or method overriding.
 
class Calculator {
	// Method overloading
	public int add(int a, int b) {
    	return a + b;
	}
 
	// Method overloading
	public double add(double a, double b) {
    	return a + b;
	}
}
 
// e. Class
// A class is a blueprint for creating objects. It defines the properties and behaviors that objects of the class will have.
 
class Dog {
	String name;
	int age;
 
	// Constructor method
	public Dog(String dogName, int dogAge) {
    	name = dogName;
    	age = dogAge;
	}
 
	public void bark() {
    	System.out.println("Woof! Woof!");
	}
}
 
public class OOPExample {
	public static void main(String[] args) {
    	// Creating an object of the Circle class (implementing an interface)
    	Circle circle = new Circle();
    	circle.draw();
 
    	// Using polymorphism with the Calculator class
    	Calculator calculator = new Calculator();
    	System.out.println("Sum of integers: " + calculator.add(5, 10));
    	System.out.println("Sum of doubles: " + calculator.add(5.5, 10.5));
 
    	// Creating an object of the Dog class
    	Dog myDog = new Dog("Buddy", 3);
    	System.out.println("Dog's name: " + myDog.name);
    	System.out.println("Dog's age: " + myDog.age);
    	myDog.bark();
	}
}
 
vi. Three Types of Associations in OOP
Association:
Explanation: A relationship between two classes where one class is associated with another. It can be one-to-one, one-to-many, or many-to-many.
Example: A Student class associated with a Course class.
Aggregation:
Explanation: A type of association where one class represents a "whole" and another class represents a "part." It is a weaker form of association.
Example: A University class aggregated with multiple Department classes.
Composition:
Explanation: A stronger form of aggregation where the "part" is essential to the "whole." If the "whole" is destroyed, the "part" is also destroyed.
Example: A Car class composed of an Engine class.
vii. Class Diagram
A class diagram is a type of UML diagram that represents the static structure of a system. It shows classes, interfaces, associations, and their relationships. Class diagrams are used during the design phase of software development.
Steps to Draw a Class Diagram:
Identify Classes: Identify the main classes and interfaces in the system.
Define Attributes and Methods: Add attributes and methods to each class.
Relationships: Identify relationships (associations, aggregations, compositions) between classes.
Multiplicity: Define the multiplicity (cardinality) of associations.
Inheritance: Represent inheritance relationships between classes.
Associations: Draw associations between classes, indicating their nature (composition, aggregation).
Generalization/Specialization: Represent generalization and specialization relationships.
Class diagram





References
Gillis, A. S. (n.d.). What is Object-Oriented Programming (OOP)? TechTarget. Retrieved January 11, 2024, from https://www.techtarget.com/searchapparchitecture/definition/object-oriented-programming-OOP
Jain, S. (2023, December 26). Object Modeling Technique (OMT) - Software Engineering. GeeksforGeeks. Retrieved January 11, 2024, from https://www.geeksforgeeks.org/software-engineering-object-modeling-technique-omt/
What is the difference between Object-oriented (OOA and OOD and OOP). (2022, October 11). Mohamed Bakrey. Retrieved January 11, 2024, from https://mohamedbakrey094.medium.com/what-is-the-difference-between-object-oriented-ooa-and-ood-and-oop-51d95499a32e

Jain, S. (2023, December 26). Object Modeling Technique (OMT) - Software Engineering. GeeksforGeeks. Retrieved January 11, 2024, from https://www.geeksforgeeks.org/software-engineering-object-modeling-technique-omt/
What is the difference between Object-oriented (OOA and OOD and OOP). (2022, October 11). Mohamed Bakrey. Retrieved January 11, 2024, from https://mohamedbakrey094.medium.com/what-is-the-difference-between-object-oriented-ooa-and-ood-and-oop-51d95499a32e

What is the difference between Object-oriented (OOA and OOD and OOP). (2022, October 11). Mohamed Bakrey. Retrieved January 11, 2024, from https://mohamedbakrey094.medium.com/what-is-the-difference-between-object-oriented-ooa-and-ood-and-oop-51d95499a32e

