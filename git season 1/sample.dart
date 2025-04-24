// Dart implementation of Sample.java

// Animal interface defines common behaviors for animals
abstract class Animal {
  // Defines how the animal moves
  void move();

  // Defines the sound the animal makes
  String makeSound();

  // Defines the eating behavior
  void eat();
}

// Cat class implements the Animal interface
class Cat implements Animal {
  final String name;

  // Constructor for Cat
  Cat(this.name);

  @override
  void move() {
    print('$name is walking gracefully');
  }

  @override
  String makeSound() {
    return 'Meow';
  }

  @override
  void eat() {
    print('$name is eating fish');
  }

  // Getter for the cat's name
  String getName() {
    return name;
  }
}

// Bird class implements the Animal interface
class Bird implements Animal {
  final String species;

  // Constructor for Bird
  Bird(this.species);

  @override
  void move() {
    print('$species bird is flying through the air');
  }

  @override
  String makeSound() {
    return 'Chirp';
  }

  @override
  void eat() {
    print('$species bird is eating seeds');
  }

  // Getter for the bird species
  String getSpecies() {
    return species;
  }
}

// Dog class implements the Animal interface
class Dog implements Animal {
  final String breed;

  // Constructor for Dog
  Dog(this.breed);

  @override
  void move() {
    print('$breed dog is running');
  }

  @override
  String makeSound() {
    return 'Woof';
  }

  @override
  void eat() {
    print('$breed dog is eating kibble');
  }

  // Getter for the dog's breed
  String getBreed() {
    return breed;
  }
}

// Main function to test the Animal implementations
void main() {
  // Create animals with appropriate parameters
  Animal a = Cat('Whiskers');
  print(a.makeSound());
  a.move();
  a.eat();

  a = Bird('Sparrow');
  print(a.makeSound());
  a.move();
  a.eat();

  a = Dog('Golden Retriever');
  print(a.makeSound());
  a.move();
  a.eat();
}
