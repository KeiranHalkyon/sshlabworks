class Stack{
	int st[] = new int[10], pt = 0;
	int pop(){
		int ret = -9999;
		if(pt>0)
			ret = st[--pt];
		else
			System.out.println("Underflow");
		display();
		return ret;
	}
	void push(int val){
		if(pt>=10)
			System.out.println("Overflow");
		else
			st[pt++] = val;
		display();
	}
	void display(){
		System.out.print("Stack content : ");
		for(int i=0;i<pt;i++)
			System.out.print(st[i]+"\t");
		System.out.println();
	}
}

class StackTest{
	public static void main(String args[]){
		Stack s1 = new Stack(), s2 = new Stack();
		s1.push(5);s2.push(45);
		s1.pop();s2.push(55);
	}
}