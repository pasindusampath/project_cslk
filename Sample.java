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

class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting");
    }
}
public class OverrideDemo{
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        Vehicle car = new Car();
        car.start();
    }
}
