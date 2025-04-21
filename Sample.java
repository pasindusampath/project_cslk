interface Animal{
	public void move();
}
class Cat implements Animal{
	@Override
	public void move(){
		System.out.println("Cat is Moving");
	}
}
