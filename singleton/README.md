# Singleton pattern

## Definition
A component which is instantiated only once

## When to use 
 - Only make one instance in the system. Such as: database repository, bean in Spring
 - Calling constructor is expensive in runtime
 - Prevent creating other copies
 - Take care of thread safety

## How to implement 
 - Make private constructor 
 - Initialize private instance
 - Public method get instance 
