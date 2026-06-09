                            SOLID

               S - Single responsibility principle(SRP)

A class should have one, and only one, reason to change. — Robert C. Martin (Uncle Bob)

But what exactly is a "responsibility"?

Ask yourself this: How many reasons might someone need to update this class in the future?

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

		  
		   L - Liskov Substitution Principle (LSP)
		  
If a class S extends or implements class T, 
then you should be able to use S anywhere T is expected, without breaking the program's behavior or logic.	

Subtypes must honor the expectations set by their base types. 
The client code should not need to know or care which specific subtype it is dealing with. Everything should "just work."	

Implementing LSP-
1. Separate behavior 
2. Use interfaces or abstract types to model capabilities explicitly 

Example :
 interface Document {
    void open();
    String getData();
 }

 interface Editable extends Document {
    void save(String newData);
 }

Now behaviors are separated , So subclass will implement which is actually need .

Common Pitfalls While Applying LSP:-
------------------------------------
1. Subtyping must be based on behavior, not just taxonomy. A penguin might be a bird in biology,
   but if your Bird interface promises flight, then Penguin is not a valid subtype.

2. Overriding Methods to Do Nothing or Throw Exceptions:
   
   @Override
   public void save(String data) {
       throw new UnsupportedOperationException("Not supported.");
   }
   
   That is a clear warning sign. If a subclass cannot meaningfully implement a method defined in the base class,
   it is likely not a valid subtype.
 
3. Violating Preconditions or Postconditions:

  Precondition: Subtype should not demand MORE.
  
  class PaymentService {

    public void processPayment(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        System.out.println("Payment processed: " + amount);
    }
  }

class PremiumPaymentService extends PaymentService {

    @Override
    public void processPayment(int amount) {

        // More restrictive condition
        if (amount <= 100) {
            throw new IllegalArgumentException(
                "Amount must be greater than 100"
            );
        }

        System.out.println("Premium payment processed: " + amount);
    }
  }
 
  PaymentService service = new PremiumPaymentService();
  service.processPayment(50);

  The base class allowed 50,
  but the subtype rejects it.

  So the subtype cannot fully substitute the base type → LSP violation.
 
  Postcondition: Subtype should not provide LESS.
  
  class UserService {

    public String getUsername(int userId) {
        return "Lokman";
    }
 }
 
 class CachedUserService extends UserService {

    @Override
    public String getUsername(int userId) {

        // Sometimes returns null
        return null;
    }
 }
 
 Problem:

 UserService service = new CachedUserService();

 String name = service.getUsername(1);

 System.out.println(name.length());

 Caller trusted the base contract:

 username will never be null

 But subtype broke that guarantee.

 Again → LSP violation.

4. Type Checks in Client Code
   Code like this is often a symptom of broken design: 
  
   if (document instanceof ReadOnlyDocument) {
    // Special-case logic
   }
  
  
                 Interface Segregation Principle (ISP)
                 
Clients should not be forced to depend on methods they do not use. Each interface should represent a specific capability or behavior. 
If a class doesn’t need a method, it shouldn’t be forced to implement it.

Each class implements only the interfaces it needs. 

Process should follow to achieve ISP:
    Design interfaces based on client needs - interfaces should represent a cohesive set of behaviors.
    that make sense together from the client’s perspective.
    
By applying ISP, you make LSP easier to follow because each interface becomes a clean, 
reliable contract that implementers can fulfill completely and correctly.

                Dependency Inversion Principle (DIP)
                
The legendary Robert C. Martin (Uncle Bob)              
 1. high-level modules should never depend directly on low-level modules. Both should depend on abstractions (e.g., interfaces).
 2. Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.
              
In plain English:

	Business logic should not rely directly on implementation details.
	Instead, both should depend on a common interface or abstraction.

Ex: Suppose i have EmailService (high level module) uses GMailClient(low level module).
EmailService depends directly on GmailClient.
Now if we want to swap then we need to change in EmailService constructor .violation of DIP.

solution:
interface EmailClient {
    void sendEmail(String to, String subject, String body);
}

Gmail implementation:
------------------------
class GmailClientImpl implements EmailClient {
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Connecting to Gmail SMTP server...");
        System.out.println("Sending email via Gmail to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        // ... actual Gmail API interaction logic ...
        System.out.println("Gmail email sent successfully!");
    }
}

Outlook implementation:
-------------------------
class OutlookClientImpl implements EmailClient {
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Connecting to Outlook Exchange server...");
        System.out.println("Sending email via Outlook to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
        // ... actual Outlook API interaction logic ...
        System.out.println("Outlook email sent successfully!");
    }
}

This technique is called Dependency Injection (DI), and it is one of the most common ways to achieve DIP in practice.

class EmailService {
    private final EmailClient emailClient; // Depends on the INTERFACE!

    // Dependency is "injected" via the constructor
    public EmailService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    public void sendWelcomeEmail(String userEmail, String userName) {
        String subject = "Welcome, " + userName + "!";
        String body = "Thanks for signing up to our awesome platform. We're glad to have you!";
        this.emailClient.sendEmail(userEmail, subject, body); // Calls the interface method
    }

}
