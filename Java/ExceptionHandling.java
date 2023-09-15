class Exco{
	public void test(){
		System.out.print("Hello World");
	}
	public static void main(String args[]){
		int b,d;
		try {
			if(args[0].equals("1")){
				b=43/0;
			}
			Exco ob=null;
			ob.test();
		}
		catch(ArithmeticException e){
		//catch(Exception e){
			System.out.println("Can not Divided by Zero");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bound");	
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Eception");
		}
		System.out.println("hi");
	}
}