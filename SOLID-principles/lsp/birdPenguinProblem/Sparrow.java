package lsp.birdPenguinProblem;

public class Sparrow implements FlyingBird {

	@Override
	public void eat() {
		 System.out.println(getClass().getSimpleName() + " is eating");
	}

	@Override
	public void fly() {
		System.out.println(getClass().getSimpleName() + " is flying");
	}
}
