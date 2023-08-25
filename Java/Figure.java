class Figure{
	void ar(){
		System.out.println("Inside Figure.ar()");
	}
}

class Rec extends Figure{
	void ar(){
		System.out.println("Inside Rec.ar()");
	}
}

class Gig extends Figure{
	void ar(){
		System.out.println("Inside Gig.ar()");
	}
}

class Demo{
	public static void main(String args[]){
		Figure f = new Figure();
		Rec r = new Rec();
		Gig g = new Gig();
		Figure fig;
		fig=f;
		fig.ar();
		fig=r;
		fig.ar();
		fig=g;
		fig.ar();
	}
}