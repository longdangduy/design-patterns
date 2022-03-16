# Factory pattern

## Definition
A component responsible solely for the wholesale (not piecewise) creation of objects.

## When to use 
 - Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-classes. 

## Benefits
 - Factory pattern offers an approach to code for interface rather than implementation.
 - Factory pattern removes the instantiation of actual implementation classes from client code, making it more robust, less coupled and easy to extend. We can easily change class implementation because client program is unaware of it.
 - Factory pattern also provides abstraction between implementation and client classes through inheritance.

## How to implement 
 - Create interface IProduct with methods of subclasses
 - Create subclasses implement IProduct: AProduct, BProduct, CProduct
 - Create ProductFactory class to with makeProduct() method to instantiate a subclass base on input


# Abtract Factory pattern

