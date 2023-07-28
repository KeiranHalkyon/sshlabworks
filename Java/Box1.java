class Box1{
	double width, length, height;
	Box1(){
		width=1;
		length=1;
		height=1;
	}
	Box1(double width, double length, double height){
		this.width = width;
		this.length = length;
		this.height = height;
	}
	double getVol(){
		return width*length*height;
	}
}