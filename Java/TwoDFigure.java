abstract class TwoDFigure{
	double x, y;
	TwoDFigure(double a, double b){
		x=a;
		y=b;
	}
	abstract double calc_area();
}

class Rectangle extends TwoDFigure{
	Rectangle(double a, double b){
		super(a, b);
	}
	double calc_area(){
		return x*y;
	}
}

class Triangle extends TwoDFigure{
	Triangle(double a, double b){
		super(a, b);
	}
	double calc_area(){
		return 0.5*x*y;
	}
}

class TDF{
	public static void main(String args[]){
		Rectangle rec = new Rectangle(3,4);
		System.out.println("Area of rectangle : "+rec.calc_area());
		Triangle tr = new Triangle(2,4);
		System.out.println("Area of triangle : "+tr.calc_area());
	}
}