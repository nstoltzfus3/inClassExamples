package Animals;

public class Cat extends Animal{
	private boolean wantsMilk;
	private int fluffThickness;
	private int legNum;
	private boolean isAccelerating;
	private final String animalType = "CAT";
	
	// if (Animal.getAnimalType.equals("CAT"))
	// instanceof Cat

	
	public Cat(int length, 
			boolean isAngry, 
			boolean wantsMilk, 
			String name, 
			String breed, 
			int fluffThickness, 
			int lives,
			int legNum) {
		super(length, isAngry, name, breed, lives);
		this.wantsMilk = wantsMilk;
		this.fluffThickness = fluffThickness;
		this.legNum = legNum;
	}
	
	public void mew() {
		System.out.println(this.getName() + " says 'mew'.");
	}
	
	public void eat()  {
		if (this.wantsMilk == true) {
			this.wantsMilk = false;
		}
	}
	

	
	public void takeDamage() {
		if (this.fluffThickness < 100) {
			this.setLives(this.getLives() - 1);
		} else {
			this.legNum--;
			this.setName("Tripod");
		}
		this.mew();
	}
	
	public void nap() {
		this.setLives(this.getLives() + 1);
		this.wantsMilk = true;
	}
	
	
	public int getFluffThickness() {
		return this.fluffThickness;
	}
	
	public void setFluffThickness(int fluff) {
		this.fluffThickness = fluff;
	}
	
//	public int getSpeed() {
//		return this.;
//	}
	
	
	public void setSpeed(int speed) {
		if (speed > this.getSpeed()) {
			this.isAccelerating = true;
			for (int i = this.getSpeed(); i < speed; i++) {
				// show the next frame of the cat running
				this.setSpeed(i);
			}
		} else {
			this.setSpeed(speed);
		}
 	}
	
	
	
	public static void main(String[] args) {
		Cat myCat1 = new Cat(86, true, false, "Bubbles", 
				"Maine Coon", 1000, 9, 7);
		Cat myCat2 = new Cat(50, true, true, "Meowth", 
				"Normal", 10, Integer.MAX_VALUE, 2);
		
		//Cat myCat3 = new Cat();
		
		myCat1.scuffle(myCat2);
		
		Integer.parseInt("12");
		
		// from a different class Driver
		//Cat newClass = new Cat();
		
		
		
//		myCat1.mew();
//		myCat2.mew();
//		myCat3.mew();
		// is not an object -> null
		Cat[] myCats = {myCat1, myCat2};
		
	}
	
	
	
}
