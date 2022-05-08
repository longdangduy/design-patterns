# Template Method pattern

## Definition
Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. 
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.

## When to use 
 - Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.
 - Use the pattern when you have several classes that contain almost identical algorithms with some minor differences. 
 As a result, you might need to modify all classes when the algorithm changes.


## How to implement 
 - Define AbstractClass and declare methods which execute steps of algorithm and template method call step methods.
 The steps method may declare abtract or have some default implementation.
 - Define ConcreteClasss can override all of the steps, but not template method.
 
 ![TemplatePattern](https://user-images.githubusercontent.com/36881424/167292447-3902330b-3a59-4062-bc91-50e45589c8e9.jpg)
