# Strategy pattern

## Definition
Define a family of algorithms, encapsulate each one, and make them interchangeable. 
Strategy lets the algorithm vary independently from clients that use it.

## When to use 
 - Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
 - Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
 - Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.
 - Use the pattern when your class has a massive conditional operator that switches between different variants of the same algorithm.

## How to implement 
 - Define interface Strategy with execute() method
 - Implement execute() method with concrete classes with ConcreteStategyA, ConcreteStategyB, ConcreteStategyC
 - Define Context class which maintains a reference to one of concreted strategy via interface Strategy

