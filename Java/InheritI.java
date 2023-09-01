interface A1{
	void happy();
}

interface A2 extends A1{
	void sad();
}

class Testing implements A2{
	public void happy(){
		System.out.println("I am Happy :)");
	}
	public void sad(){
		System.out.println("I am sad :(");
	}
	public static void main(String args[]){
		Testing t = new Testing();
		t.sad();
		t.happy();
	}
}