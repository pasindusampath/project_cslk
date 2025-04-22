interface Animal{
	public void move();
}
class Cat implements Animal{
	@Override
	public void move(){
		System.out.println("Cat is Moving");
	}
}
class Bird implements Animal{
	@Override
	public void move(){
		System.out.println("Bird is Flying");
	}
}

class Dog implements Animal{
	@Override
	public void move(){
		System.out.println("Dog is Running");
	}
}
class Sample{
	public static void main(String[] args){
		Animal a = new Cat();
		a.move();
		a = new Bird();
		a.move();
		a = new Dog();
		a.move();
	}
}
