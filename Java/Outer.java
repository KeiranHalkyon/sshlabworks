class Outer{
	int x;
	static class NestedClass{
		int k;
		void display(Outer obj){
			System.out.println("k : "+k);
			System.out.println("x : "+obj.x);
		}
	}
}

class OuterTest{
	public static void main(String args[]){
		Outer ob = new Outer();
		ob.x=5;
		Outer.NestedClass inn = new Outer.NestedClass();
		inn.k=10;
		inn.display(ob);
	}
}