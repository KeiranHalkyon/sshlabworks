class Complex{
	double real, imag;
	static int net = 0;
	Complex(double r, double i){
		real = r;
		imag = i;
		net++;
	}
	Complex(){
		real=imag=0;
		net++;
	}
	protected void finalize(){
		net--;
	}
	String display(){
		return ""+real+((imag>0)?"+":"")+imag+"i";
	}
	Complex sum(Complex a){
		return new Complex(real+a.real,imag+a.imag);
	}
	Complex sub(Complex a){
		return new Complex(real-a.real,imag-a.imag);
	}
	Complex mul(Complex a){
		return new Complex(real*a.real-imag*a.imag, real*a.imag + imag*a.real);
	}
	double mod(){
		return Math.sqrt(real*real+imag*imag);
	}
	Complex compl(){
		return new Complex(real, -1*imag);
	}
	public static void main(String args[]){
		Complex c1 = new Complex(5,7),
			c2 = new Complex(-6,-9);
		System.out.println("C1 = "+c1.display());
		System.out.println("C2 = "+c2.display());
		System.out.println("C1 + C2 = "+c1.sum(c2).display());
		System.out.println("C1 - C2 = "+c1.sub(c2).display());
		System.out.println("C1 * C2 = "+c1.mul(c2).display());
		System.out.println("C1 modulus = "+c1.mod());
		System.out.println("C1 complement = "+c1.compl().display());
		System.out.println("net : "+net);
	}
}