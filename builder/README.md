# Builder pattern
When construction gets a little bit to complicated

## Definition
When piecewise object construction is complicated, provide an API for doing it succinctly

## When to use 
 - Some objects are simple and can be creatd in signle constructor call
 - Other objects require a lot of ceremony to create
 - Having an object with 10 constructor arguments is not productive 
 - Instead, opt for piecewise construction
 - Builder provides an API for constructing an object step by step
 

## How to implement 
 - Add additional XXXBuilder class which to build desired XXX instance
 - Implement XXXBuilder class to set all attributes of XXX 
