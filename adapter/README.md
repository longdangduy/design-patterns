# Adapter pattern

## Definition
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate

## When to use 
 - You want to use an existing class, and its interface does not match the one you need.
 - You want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don’t necessarily have compatible interfaces.
 - You need to use several existing subclasses, but it’s impractical to adapt their interface by subclassing every one. 
An object adapter can adapt the interface of its parent class (for object adapter only).

## How to implement 
There are 2 types of implementation: 
### Object Adapter 
This uses the object composition principle. The adapter implements the interface of one object and wraps the other one.

### Class Adapter: 
This uses inheritance. the adapter inherits interfaces from both objects at the same time.