class ThrowsDemo{
	static void throwme()throws IllegalAccessException{
		System.out.println("Inside Throw me");
		throw new IllegalAccessException("Demo");	
	}
	public static void main(String args[]){
		try{
			throwme();
		}
		catch(IllegalAccessException e){
			System.out.println("illegal exception Caught");
		}	
	}	
}		