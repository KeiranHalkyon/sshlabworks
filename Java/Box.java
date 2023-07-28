class Box{
	double width, length, height;
	void setData(double w, double l, double h){
		width = w;
		length = l;
		height = h;
	}
	double getVol(){
		return width*length*height;
	}
}