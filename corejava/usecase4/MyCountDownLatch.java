package corejava.usecase4;

public class MyCountDownLatch {
	
	private volatile int parties;

	public MyCountDownLatch(int parties) {
		super();
		this.parties = parties;
	}


	public int getParties() {
		return parties;
	}
	
	
	public synchronized void await() throws InterruptedException {
		while(parties != 0) {
			this.wait();
		}
	}
	
	public synchronized void countDown() {
		parties--;
		this.notifyAll();
	}
}
