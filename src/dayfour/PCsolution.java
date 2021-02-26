package dayfour;

import java.util.LinkedList;

public class PCsolution {

	public static void main(String[] args) throws InterruptedException {
		
		final ProducerConsumer pc = new ProducerConsumer();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try { 
                    pc.produce(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            }
				
			
		});
		
		Thread t2 = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
                try { 
                    pc.consume(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        });
		
		t1.start(); 
        t2.start(); 
        
        t1.join(); 
        t2.join();
		

	}
	
	public static class ProducerConsumer {
		
		LinkedList<Integer> list = new LinkedList<>();
		Integer capacity = 2;
		
		public void produce() throws InterruptedException {
			
			Integer value = 0;
			while (true) {
				synchronized (this) {
					while (list.size() == capacity) {
						wait();
					}
					System.out.println("Produced - " + value);
					
					list.add(value++);
					
					notify();
					
					Thread.sleep(500);
				}
			}
		}
		
		public void consume() throws InterruptedException {
			
			while(true) {
				synchronized (this) {
					
					while (list.size() == 0) {
						wait();
					}
					
					int val = list.removeFirst();
					
					System.out.println("Consumed" + val);
					
					notify();
					
					Thread.sleep(500);
				}
			}
		}
	}
}
