                            SOLID

               S - Single responsibility principle

A class should have one, and only one, reason to change. — Robert C. Martin (Uncle Bob)

But what exactly is a "responsibility"?

Ask yourself this:

How many reasons might someone need to update this class in the future?

If the answer is more than one, the class is likely breaking SRP.

Decisions should take when to apply SRP:

-If you need to use the word “and” or “or” to describe what your class does, it probably has more than one responsibility.

			 O - Open-Closed Principle (OCP)
			 
Open for Extension: The behavior of the entity can be extended. As new requirements come in (like new payment types), 
you should be able to add new behavior without touching existing code.

Closed for Modification: The existing, working code should not be changed. Once it is written, tested, and working,
 you should not need to go back and alter it to add new features.
 
Sounds like a paradox, right? How can you add new features without changing existing code? The answer lies in abstraction.	

By programming against interfaces rather than concrete implementations, 
you can introduce new behavior simply by creating new classes that implement the existing interface.

When should I apply OCP? 

OCP is most beneficial in parts of your system that you anticipate will change or have variations. 
If a piece of code is very stable and unlikely to have new variations, forcing OCP might be an over-complication.

		 