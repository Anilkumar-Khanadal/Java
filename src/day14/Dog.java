package day14;

public class Dog extends Animal {

	@Override
    public void sound() {
        System.out.println("Bark");
    }
	
	public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
