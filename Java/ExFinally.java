class ExFinally{
	static int test(){
		try{
			System.out.println("In test()");
			return 1;
		}
		catch(ArithmeticException e){
			System.out.println("Caught");
		}
		finally{
			System.out.println("In finally");
			return 2;
		}
	}
	public static void main(String args[]){
		System.out.printf("Returned : %d\n",test());
	}
}