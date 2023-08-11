class Point{
	double x, y;
	Point(double a, double b){
		x=a;
		y=b;
	}
	static double dist(Point a, Point b){
		return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
	}
	String val(){
		return "("+x+","+y+")";
	}
	public static void main(String args[]){
		Point a = new Point(2,5),
			b = new Point(5,-9);
		System.out.println("Points are : "+a.val()+", "+b.val());
		System.out.println("Distance is : "+dist(a,b));
	}
}