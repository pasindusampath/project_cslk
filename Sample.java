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
