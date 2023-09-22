class ChainedEx{
	static void demoprac(){
		NullPointerException e = new NullPointerException("Top Layer");
		e.initCause(new ArithmeticException("Demo"));
		throw e;
	}
	public static void main(String args[]){
		try{
			demoprac();
		}
		catch(NullPointerException e){
			System.out.println("Caught : "+e);
			System.out.println("Original Cause : "+e.getCause());
		}
	}
}