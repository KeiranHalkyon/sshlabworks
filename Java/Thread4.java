class ThreadX implements Runnable{
	int tno;
	Thread t;
	ThreadX(int n){
		tno=n;
		t=new Thread(this,"Thread "+tno);
		t.start();
	}
	public void run(){
		for(int i=0;i<3;i++){
			try{
				System.out.println("In Thread : "+tno);
				Thread.sleep(500);
			}
			catch(InterruptedException e){}
		}
	}
}

class Thread4{
	public static void main(String args[])throws InterruptedException{
		ThreadX a=new ThreadX(1);
		ThreadX b=new ThreadX(2);
		
		if(a.t.isAlive())
			a.t.join();
		if(b.t.isAlive())
			b.t.join();
		System.out.println("Main Completed");
	}
}