# Observer pattern

## Definition
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## When to use 
 - Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically
 - Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases

## Benefits
 - Open/Closed Principle: add new subscriber classes without having to change the publisher’s code 
 - You can establish relations between objects at runtime

## How to implement 
 - Define interface Subject with method: attachObserver(), detachObserver(), notifyObserver()
 - Define classs ConcreteSubject implement Subject, and contain list of Observer
 - Define interface Observer with method: update() which is called when state of Subject changing
 - Define class ConcreteSubject implement Observer
 