class ThreadX implements Runnable{
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println("In Child");
				Thread.sleep(500);
			}
			System.out.println("Child Terminated");
		}catch(InterruptedException e){
			System.out.println("InterruptedException");
		}
	}
}

class Thread2{
	public static void main(String args[]) throws InterruptedException{
		System.out.println("In Main");
		Thread t1 = new Thread(new ThreadX(),"Child");
		t1.start();
		t1.join();//waits for child t1 to end
		System.out.println("Main Ended");
	}
}