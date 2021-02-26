package dayfour;

public class DeadlockDemo {

	public static void main(String[] args) {
		FootballClub manu = new FootballClub("Manchester Utd", 8.9F, 25);
		FootballClub liv = new FootballClub("Liverpool", 6.7F, 15);
		
		System.out.println("Start DL Example");
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (manu) {
						Thread.sleep(50);
						synchronized (liv) {
							System.out.println("Thread 1 is running with 2 locks");
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		};
		
		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				try {
					synchronized (liv) {
						Thread.sleep(50);
						synchronized (manu) {
							System.out.println("Thread 2 is running with 2 locks");
						}
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		
		System.out.println("End DL Example");
	}

}
