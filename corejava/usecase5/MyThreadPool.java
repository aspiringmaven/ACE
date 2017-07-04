package corejava.usecase5;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool {
	
	private final int size;
	private final BlockingQueue<Runnable> jobs;
	private Worker[] workers;
	private volatile boolean  shutdown;

	public MyThreadPool(int size) {
		super();
		shutdown = false;
		this.size = size;
		this.jobs = new LinkedBlockingQueue<>();
		workers = new Worker[size];
		for(int i=0;i<this.size;i++) {
			workers[i] = new Worker("MyThreadPool - Worker - " + i);
			workers[i].start();
		}
	}

	
	public void submit(Runnable job) throws InterruptedException {
		if(shutdown) throw new RuntimeException("Can not take more work shutdown hook initiated");
		jobs.put(job);
	}
	
	private class Worker extends Thread{

		public Worker(String name) {
			super(name);
		}
		
		@Override
		public void run() {
			System.out.println();
			while(!shutdown || !jobs.isEmpty()) {
				try {
					jobs.take().run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	
	public void shutdown() {
		this.shutdown = true;
	}
	

}


