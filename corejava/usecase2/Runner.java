package corejava.usecase2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Runner {
	
	public static void main(String[] args) {
	
		ExecutorService producerPool = Executors.newFixedThreadPool(10);
		ExecutorService consumerPool = Executors.newFixedThreadPool(10);
		
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		
		for(int i=0;i<10;i++) {
			producerPool.execute(new Producer(queue, "Producer " + i));
			consumerPool.execute(new Consumer(queue, "Cosumer "+ i));
		}
		
		
	}
	
}
