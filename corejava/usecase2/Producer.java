package corejava.usecase2;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
	
	private final BlockingQueue<Integer> queue;
	private final String name;
	private static boolean running; // one to stop all thread in go
	
	static {
		running = true;
	}
	
	public Producer(BlockingQueue<Integer> queue, String name) {
		super();
		this.queue = queue;
		this.name = name;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		while (running) {
			int val =  new Random().nextInt(100);
			try {
				queue.put(val);
				System.out.println("Producer " + getName()+"   put " + val);
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
	
	public final BlockingQueue<Integer> getQueue() {
		return queue;
	}
	public final String getName() {
		return name;
	}
	
	public static void kill() {
		running = running && false;
	}
	
	
}
