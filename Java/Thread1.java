class Thread1{
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println("Default name : "+t.getName());
		t.setName("MyThread");
		System.out.println("New name : "+t.getName());
	}
}
