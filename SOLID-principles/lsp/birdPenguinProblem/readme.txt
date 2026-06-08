Refactor Bird/Penguin Class

Problem:  A Bird class has both eat() and fly() methods. A Penguin subclass extends Bird but overrides fly() to throw an exception,
 since penguins cannot fly. Any client code that calls fly() on a Bird reference will crash at runtime when it gets a Penguin.

Requirements:

Create a Bird interface with only an eat() method
Create a FlyingBird interface that extends Bird and adds a fly() method
Sparrow implements FlyingBird (it can eat and fly)
Penguin implements Bird (it can eat, but not fly)
Client code that works with Bird should never call fly(), and code that needs flight should accept FlyingBird.

// Before: Penguin extends Bird but can't fly
class Bird {
    public void eat() {
        System.out.println(getClass().getSimpleName() + " is eating");
    }

    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }
}

class Sparrow extends Bird {}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

public class Main {
    public static void makeBirdFly(Bird bird) {
        bird.fly(); // Crashes for Penguin!
    }

    public static void main(String[] args) {
        makeBirdFly(new Sparrow()); // Works fine
        makeBirdFly(new Penguin()); // UnsupportedOperationException!
    }
}

// TODO: Split Bird into a Bird interface (eat) and a FlyingBird interface (fly).
// TODO: Sparrow implements FlyingBird, Penguin implements only Bird.