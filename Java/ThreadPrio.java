class Clicker implements Runnable{
	long click=0;
	Thread t;
	private static volatile boolean running = true;
	public Clicker(int p){
		t = new Thread(this);
		t.setPriority(p);
	}
	public void run(){
		while(running) click++;
	}
	public static void stop(){
		running = false;
	}
	public void start(){
		t.start();
	}
}

class HiLoPri{
	public static void main(String args[]){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi = new Clicker(Thread.NORM_PRIORITY+2);
		Clicker lo = new Clicker(Thread.NORM_PRIORITY-2);
		lo.start();
		hi.start();
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Main Interrupted");
		}
		Clicker.stop();
		try{
			hi.t.join();
			lo.t.join();
		}catch(InterruptedException e){}
		System.out.println("Low Priority Thread : "+ lo.click);
		System.out.println("High Priority Thread : "+ hi.click);
	}
}