package lsp.birdPenguinProblem;

public class Penguin implements Bird {

	@Override
	public void eat() {
		
		 System.out.println(getClass().getSimpleName() + " is eating");
	}

}
