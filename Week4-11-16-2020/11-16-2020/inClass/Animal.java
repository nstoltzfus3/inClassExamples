package Animals;

public abstract class Animal {
	private int length;
	private boolean isAngry;
	private String name;
	private String breed;
	private int lives;
	private int speed;
	
	
	public Animal(int length, 
			boolean isAngry, 
			String name, 
			String breed, 
			int lives) {
		super();
		this.length = length;
		this.isAngry = isAngry;
		this.name = name;
		this.breed = breed;
		this.lives = lives;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public boolean isAngry() {
		return isAngry;
	}


	public void setAngry(boolean isAngry) {
		this.isAngry = isAngry;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public int getLives() {
		return lives;
	}


	public void setLives(int lives) {
		this.lives = lives;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public abstract void takeDamage();
	
	public void scuffle(Animal otherAnimal) {
		this.takeDamage();
		otherAnimal.takeDamage();
	}
	
}
