SOLID

               S - Single responsibility principle

A class should have one, and only one, reason to change. — Robert C. Martin (Uncle Bob)

But what exactly is a "responsibility"?

Ask yourself this:

How many reasons might someone need to update this class in the future?

If the answer is more than one, the class is likely breaking SRP.

Decisions should take when to apply SRP:

-If you need to use the word “and” or “or” to describe what your class does, it probably has more than one responsibility.

