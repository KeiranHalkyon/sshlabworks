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
0
class Thread3{
	public static void main(String args[])throws InterruptedException{
		new ThreadX(1);
		new ThreadX(2);
		for(int i=0;i<3;i++){
			try{
				System.out.println("In Main");
				Thread.sleep(500);
			}
			catch(InterruptedException e){}
		}
		Thread.sleep(3000);
		System.out.println("Main Completed");
	}
}