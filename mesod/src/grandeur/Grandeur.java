package grandeur;

public class Grandeur {

	public String color;
	public String gear;
	public int price;
	public String girl;
	
	public Grandeur(String c, String g, int p, String gi) {
		System.out.println("Grandeur constructor");
		color =c;
		gear = g;
		price = p;
		girl = gi;
	}

	public void run() {
		System.out.println("--run()--");
	}

	public void stop() {
		System.out.println("--stop()--");
	}
	
	public void info() {
		System.out.println("--info()--");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
		System.out.println("girl : " + girl);
	}
	 
	
}

