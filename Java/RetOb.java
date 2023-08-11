class RetOb{
	int x;
	static RetOb getObj(int val){
		RetOb n = new RetOb();
		n.x = val;
		return n;
	}
	public static void main(String args[]){
		RetOb ob = getObj(6);
		System.out.printf("x : %d\n",ob.x);
	}
}