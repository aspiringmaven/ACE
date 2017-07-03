package corejava.usecase4;

public class Example1 {

	public static void main(String[] args) {
		
		MyCountDownLatch latch = new MyCountDownLatch(2);
		
		new Thread(new Transfer(latch)).start();
		new Thread(new Connector(latch)).start();
		new Thread(new Connector(latch)).start();
	}
	
}

class Connector  implements Runnable{
	private final MyCountDownLatch latch;
	
	public Connector(MyCountDownLatch latch) {
		super();
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println("Worked");
		latch.countDown();
	}
}


class Transfer implements Runnable {
	private final MyCountDownLatch latch;
	
	
	
	public Transfer(MyCountDownLatch latch) {
		super();
		this.latch = latch;
	}



	@Override
	public void run() {
		System.out.println("transfer waiting connection to be done");
		try {
			latch.await();
			System.out.println("transfer done");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}