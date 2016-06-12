package head.first;

public class DogTestDrive {
	
	public static void main (String[] args) {
		//Dog d = new Dog();
		//d.size = 40;
		//d.bark();
		Dog one = new Dog();
//		one.size = 70;
		one.setSize(70);
		Dog two = new Dog();
		//two.size = 8;
		two.setSize(8);
		Dog three = new Dog();
		//three.size = 25;
		three.setSize(25);
		
		one.barkTimes(5);
		two.barkTimes(5);
		three.barkTimes(5);
	}
	
}
