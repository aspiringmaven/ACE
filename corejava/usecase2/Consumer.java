package corejava.usecase2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
	
	private final BlockingQueue<Integer> queue;
	private final String name;
	private static boolean running; // one to stop all thread in go
	
	static {
		running = true;
	}

	public Consumer(BlockingQueue<Integer> queue, String name) {
		super();
		this.queue = queue;
		this.name = name;
	}

	@Override
	public void run() {
		Thread.currentThread().setName(name);
		while (running) {
			try {
				Integer val = queue.take();
				System.out.println("Consumer " + getName()+"   take " + val);
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static final boolean isRunning() {
		return running;
	}

	public static final void kill() {
		Consumer.running = false;;
	}

	public final BlockingQueue<Integer> getQueue() {
		return queue;
	}

	public final String getName() {
		return name;
	}

	
	
}
