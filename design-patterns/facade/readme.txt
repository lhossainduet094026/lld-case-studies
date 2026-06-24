The Facade Design Pattern is a structural design pattern that provides a single, 
simplified interface to a complex subsystem. Instead of forcing clients to coordinate many moving parts, 
a facade hides the internal complexity and exposes a clean, easy-to-use entry point.

It’s particularly useful in situations where:

-Your system contains many interdependent classes or low-level APIs.
-The client doesn’t need to know how those parts work internally.
-You want to reduce coupling and make the system easier to learn and use.

In this pattern client uses facade classes and facade encapsulates independent classes . 