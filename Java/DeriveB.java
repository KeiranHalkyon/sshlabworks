class DeriveB{
	void display(int n){
		System.out.println("Inside base n(int) : "+n);
	}
}

class Derive1 extends DeriveB{
	void display(String x){
		System.out.println("Inside child Derive1 n(String) : "+x);
	}
}

class Derive2 extends DeriveB{
	void display(char ch){
		System.out.println("Inside child Derive2 n(char) : "+ch);
	}
}

class TestDerive{
	public static void main(String args[]){
		DeriveB db = new DeriveB();
		db.display(5);
		Derive1 db1 = new Derive1();
		db1.display("hi");
		db1.display(6);
		Derive2 db2 = new Derive2();
		db2.display('Y');
	}
}