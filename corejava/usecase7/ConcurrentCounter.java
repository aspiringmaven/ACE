package corejava.usecase7;

import java.util.concurrent.Semaphore;

public class ConcurrentCounter {
	
	private volatile int count=0;
	Semaphore semaphore = new Semaphore(1);

	
	public int increment() throws InterruptedException {
		try {
			semaphore.acquire();
			count++;
			return count;
		} finally {
			semaphore.release();
		}
	}
	
	public int getCount() throws InterruptedException {
		try {
			semaphore.acquire();
			return count;
		} finally {
			semaphore.release();
		}
		
		
	}

}
