package head.first;

public class Dog {
	
	private int size;
	String breed;
	String name;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int s) {
		size = s;
	}
	
	void bark() {
		//System.out.println("Ruff!!")
		if (size > 60) {
			System.out.println("Woof! Woof!");
		} else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
	
	void barkTimes(int numOfBark) {
		while (numOfBark > 0) {
			bark();
			numOfBark = numOfBark - 1;
		}
	}

}
