/**
 * Animal interface defines common behaviors for animals
 */
interface Animal {
    /**
     * Defines how the animal moves
     */
    void move();
    
    /**
     * Defines the sound the animal makes
     */
    String makeSound();
    
    /**
     * Defines the eating behavior
     */
    void eat();
}

/**
 * Cat class implements the Animal interface
 */
class Cat implements Animal {
    private String name;
    
    /**
     * Constructor for Cat
     * @param name the cat's name
     */
    public Cat(String name) {
        this.name = name;
    }
    
    @Override
    public void move() {
        System.out.println(name + " is walking gracefully");
    }
    
    @Override
    public String makeSound() {
        return "Meow";
    }
    
    @Override
    public void eat() {
        System.out.println(name + " is eating fish");
    }
    
    /**
     * @return the cat's name
     */
    public String getName() {
        return name;
    }
}

/**
 * Bird class implements the Animal interface
 */
class Bird implements Animal {
    private String species;
    
    /**
     * Constructor for Bird
     * @param species the bird species
     */
    public Bird(String species) {
        this.species = species;
    }
    
    @Override
    public void move() {
        System.out.println(species + " bird is flying through the air");
    }
    
    @Override
    public String makeSound() {
        return "Chirp";
    }
    
    @Override
    public void eat() {
        System.out.println(species + " bird is eating seeds");
    }
    
    /**
     * @return the bird species
     */
    public String getSpecies() {
        return species;
    }
}

/**
 * Dog class implements the Animal interface
 */
class Dog implements Animal {
    private String breed;
    
    /**
     * Constructor for Dog
     * @param breed the dog breed
     */
    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public void move() {
        System.out.println(breed + " dog is running");
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public void eat() {
        System.out.println(breed + " dog is eating kibble");
    }
    
    /**
     * @return the dog's breed
     */
    public String getBreed() {
        return breed;
    }
}

/**
 * Main class to test the Animal implementations
 */
class Sample {
    public static void main(String[] args) {
        // Create animals with appropriate parameters
        Animal a = new Cat("Whiskers");
        System.out.println(a.makeSound());
        a.move();
        a.eat();

        a = new Bird("Sparrow");
        System.out.println(a.makeSound());
        a.move();
        a.eat();

        a = new Dog("Golden Retriever");
        System.out.println(a.makeSound());
        a.move();
        a.eat();
    }
}
class Dog implements Animal{
	@Override
	public void move(){
		System.out.printl("Dog bark");
	}
}
