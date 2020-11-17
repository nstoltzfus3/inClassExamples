package Animals;

public class Dog extends Animal{

	public Dog(int length, 
			boolean isAngry, 
			String name, 
			String breed, 
			int lives) {
		super(length, isAngry, name, breed, lives);
	}
	
	public void takeDamage() {
		if (!this.isAngry()) {
			this.setLives(this.getLives() - 1);
		}
	}
}
