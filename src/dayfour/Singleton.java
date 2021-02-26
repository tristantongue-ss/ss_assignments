package dayfour;

public class Singleton {
	
	private volatile static Singleton demo;
	
	private Singleton() {
		
	}

	
	public static void main(String[] args) {
		createInstance();

	}
	
	
	public static Singleton createInstance() {
		if (demo == null) {
			synchronized (Singleton.class) {
				if (demo == null) {
					demo = new Singleton();
				}
			}
		}
		return demo;
	}

}
