class InfClass{
	interface A{
		void test();
	}
}

class Test implements InfClass.A{
	public void test(){
		System.out.println("Nested Implementation");
	}
	public static void main(String args[]){
		new Test().test();
	}
}