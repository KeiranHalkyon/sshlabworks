class NExc{
	public static void main(String args[]){
		try{
			try{
				String s= args[0];
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array out of bound Exception");
			int d=0;
			int a=5/d;
			}
		}	
		catch(ArithmeticException e){
			System.out.println("Can not Divided by Zero");
		}	
	}
}		