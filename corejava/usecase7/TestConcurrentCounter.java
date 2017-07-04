package corejava.usecase7;


public class TestConcurrentCounter {

	public static void main(String[] args) throws InterruptedException {
		ConcurrentCounter counter =  new ConcurrentCounter();
		Thread t1 = new Thread(new Job(counter));
		Thread t2 = new Thread(new Job(counter));
		
		t1.start();
		t2.start();
		
		while(t1.isAlive() || t2.isAlive());
		
		System.out.println(counter.getCount());
	}
	

	
}

class Job implements Runnable {
	ConcurrentCounter counter;

	public Job(ConcurrentCounter counter) {
		super();
		this.counter = counter;
	}



	@Override
	public void run() {
		
		for(int i=0;i<1000;i++) {
			try {
				counter.increment();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
}
