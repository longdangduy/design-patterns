# State pattern

## Definition
Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

## When to use 
 - Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently
 - Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields
 - Use State when you have a lot of duplicate code across similar states and transitions of a condition-based state machine

## Benefits
 - Single Responsibility Principle: organize the code related to particular states into separate classes, one state for one class
 - Open/Closed Principle: add new states without changing existing state classes or the context
 - Simplify the code of the context by eliminating bulky state machine conditionals

## How to implement 
 - Define interface State with method handleState()
 - Define concrete state classes implement State with handle each state
 - Create Context class contain State, and have method to setState() and handleState() which call handleState() of interface State
 