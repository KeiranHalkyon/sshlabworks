interface I1{
	void abc();
}

interface I2{
	void def();
}

class A implements I1, I2{
	public void abc(){
		System.out.println("From I1");
	}
	public void def(){
		System.out.println("From I2");
	}
	public static void main(String args[]){
		A obj = new A();
		obj.abc();
		obj.def();
	}
}

