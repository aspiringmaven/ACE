package corejava.usecase5;

import java.util.concurrent.TimeUnit;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		MyThreadPool myThreadPool =  new MyThreadPool(2);
		
		myThreadPool.submit(new Job("Star", "*"));
		myThreadPool.submit(new Job("Pound", "#"));
		myThreadPool.submit(new Job("plus", "+"));
		myThreadPool.submit(new Job("Minus", "-"));
	
		myThreadPool.submit(new Job("At", "@"));
		myThreadPool.shutdown();
		myThreadPool.submit(new Job("At", "@"));
		
	}

}


class Job implements Runnable {

	private String name;
	private String printer;

	public Job(String name, String printer) {
		super();
		this.name = name;
		this.printer = printer;
	}



	@Override
	public void run() {		
		System.out.println(name+" "+printer +" Start");
		for(int i=0;i<10;i++) {
			System.out.print(printer);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n"+name+" "+printer +" End");
	}
	
}