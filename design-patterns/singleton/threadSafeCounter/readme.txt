Implement Singleton Counter Class

Problem: Implement a Counter singleton that tracks a count across the application. 
Multiple components should be able to increment the counter, and all must see the same value.

Requirements:

increment() increases the count by 1
getCount() returns the current count
Thread-safe: concurrent increments must not lose updates.
Calling the constructor/access method from different places returns the same instance.