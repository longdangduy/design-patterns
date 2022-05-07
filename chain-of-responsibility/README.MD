# Chain of Responsibility pattern

## Definition
Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. 
Chain the receiving objects and pass the request along the chain until an object handles it.

## When to use 
 - Use the Chain of Responsibility pattern when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand.
 - Use the pattern when it’s essential to execute several handlers in a particular order.
 

## Benefits
 - Loose Coupling: you can decouple classes that invoke operations from classes that perform operations
 - Single Responsibility principle: each class has a separation responsibility
 - Open/Closed principle: You can introduce new handlers into the app without breaking the existing client code
 - You can control the order of request handling

## How to implement 
 - Define Handler interface (or abtract class) for handling requests
 - Define ConcreteHandler class to handle request, it's responsible for.
This class can access its successor
![ChainOfResponsibility](https://user-images.githubusercontent.com/36881424/167239368-6aea00c4-cb09-427c-a1be-1733160dc44c.jpg)


## Other variant
Other variant of Chain of Responsibility pattern is **Filter pattern**.
Filter pattern is used when you want to execute some steps before/after handle request.
This pattern is often used in authentication, authorization, logging. 

Example:

![image](https://user-images.githubusercontent.com/36881424/167239646-11f50cb5-5710-49a0-8df6-a798a218d329.png)
