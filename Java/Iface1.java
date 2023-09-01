interface Iface1{
	void display();
}

abstract class A implements Iface1{}

class Itest implements Iface1{
	public void display(){
		System.out.println("From Direct Implementation");
	}
}

class Sub extends A{
	public void display(){
		System.out.println("From Abstract Class");
	}
	public static void main(String args[]){
		new Itest().display();
		new Sub().display();
	}
}