class ExceptionHandling {
    static void checkCondition(String args[]){
        try{
			String s= args[0];
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out of Bound " );
			int a=10/0;
		}
		
    }
    public static void main(String[] args) {
        try {
            checkCondition(args);
        } catch (ArithmeticException e) {
            System.out.println("No Division by Zero " );
        }
    }
}
