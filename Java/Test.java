class Test{
	public static void main(String args[]){
		/*
		Box b1 = new Box(), b2 = new Box();
		b1.setData(2,4,5);
		b2.setData(3,3,3);
		*/
		Box1 b1 = new Box1(2,4,5), b2 = new Box1();
		double vol1 = b1.getVol(), vol2 = b2.getVol();
		if(vol1 > vol2)
			System.out.println("Rectangular Box is bigger");
		else if(vol1 < vol2)
			System.out.println("Rectangular Box is smaller");
		else
			System.out.println("Rectangular Box and Cube are equal in volume");
	}		
}