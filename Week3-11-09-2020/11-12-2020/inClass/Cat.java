package helloWorld;

public class Cat {
	private int length;
	private boolean isAngry;
	private boolean wantsMilk;
	private String name;
	private String breed;
	private int fluffThickness;
	private int lives;
	private int legNum;
	
	public Cat(){
		
	}
	
	public Cat(int length, 
			boolean isAngry, 
			boolean wantsMilk, 
			String name, 
			String breed, 
			int fluffThickness, 
			int lives,
			int legNum) {
		super();
		this.length = length;
		this.isAngry = isAngry;
		this.wantsMilk = wantsMilk;
		this.name = name;
		this.breed = breed;
		this.fluffThickness = fluffThickness;
		this.lives = lives;
		this.legNum = legNum;
	}
	
	public void mew() {
		System.out.println(this.name + " says 'mew'.");
	}
	
	public void eat()  {
		if (this.wantsMilk == true) {
			this.wantsMilk = false;
		}
	}
	
	public void scuffle(Cat otherCat) {
		this.takeDamage();
		otherCat.takeDamage();
	}
	
	public void takeDamage() {

		if (this.fluffThickness < 100) {
			this.lives--;
		} else {
			this.legNum--;
			this.name = "Tripod";
		}
		this.mew();
	}
	
	public void nap() {
		this.lives ++;
		this.wantsMilk = true;
	}
	
	
	
	public static void main(String[] args) {
		Cat myCat1 = new Cat(86, true, false, "Bubbles", 
				"Maine Coon", 1000, 9, 7);
		Cat myCat2 = new Cat(50, true, true, "Meowth", 
				"Normal", 10, Integer.MAX_VALUE, 2);
		
		Cat myCat3 = new Cat();
		
		myCat1.scuffle(myCat2);
		
//		myCat1.mew();
//		myCat2.mew();
//		myCat3.mew();
		// is not an object -> null
		Cat[] myCats = {myCat1, myCat2};
		
	}
	
	
	
}
