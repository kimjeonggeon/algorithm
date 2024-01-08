package java_jungsuk;

public class Polymorphism {
	interface Predator {
	    String getFood();

	    default void printFood() {
	        System.out.printf("my food is %s\n", getFood());
	    }
	}

	interface Barkable {
	    void bark();
	}

	interface BarkablePredator extends Predator, Barkable {
	}

	class Animal {
	    String name;

	    void setName(String name) {
	        this.name = name;
	    }
	}

	class Tiger extends Animal implements Predator, Barkable {
	    public String getFood() {
	        return "apple";
	    }

	    public void bark() {
	        System.out.println("æÓ»Ô");
	    }
	}

	class Lion extends Animal implements BarkablePredator {
	    public String getFood() {
	        return "banana";
	    }

	    public void bark() {
	        System.out.println("¿∏∏£∑∑");
	    }
	}

	class ZooKeeper {
	    void feed(Predator predator) {
	        System.out.println("feed " + predator.getFood());
	    }
	}

	class Bouncer {
	    void barkAnimal(Barkable animal) {
	        animal.bark();
	    }
	}

	    public static void main(String[] args) {
	        Tiger tiger = new Tiger();
	        Lion lion = new Lion();

	        Bouncer bouncer = new Bouncer();
	        bouncer.barkAnimal(tiger);
	        bouncer.barkAnimal(lion);
	    }
	}

	
	
	
