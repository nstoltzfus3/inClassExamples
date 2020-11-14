package helloWorld;

public class GenericObject {
	private String stuff;
	private String stuff1;
	private String stuff2;
	private int stuff3;
	private GenericObject stuff9;
	
	public GenericObject(String stuff, String stuff1, 
			String stuff2, int stuff3, GenericObject stuff9) {
		super();
		this.stuff = stuff;
		this.stuff1 = stuff1;
		this.stuff2 = stuff2;
		this.stuff3 = stuff3;
		this.stuff9 = stuff9;
	}
	
	public String getStuff() {
		return stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public String getStuff1() {
		return stuff1;
	}





	public void setStuff1(String stuff1) {
		this.stuff1 = stuff1;
	}





	public String getStuff2() {
		return stuff2;
	}





	public void setStuff2(String stuff2) {
		this.stuff2 = stuff2;
	}





	public int getStuff3() {
		return stuff3;
	}





	public void setStuff3(int stuff3) {
		this.stuff3 = stuff3;
	}





	public GenericObject getStuff9() {
		return stuff9;
	}





	public void setStuff9(GenericObject stuff9) {
		this.stuff9 = stuff9;
	}





	public void method1() {
		System.out.print("Hello from method 1.");
	}
}
