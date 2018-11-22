
public class testclass {

	public static void main(String[] args) {
		
		// testing Rect
		Rect r1 = new Rect(10, 20, 30, 40);
		Rect r2 = new Rect(0, 0, 0, 0);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.print("\n");
		
		//testing Hero
		Hero hero1 = new Hero("Barry", "speed", 20);
		Hero hero2 = new Hero("Kent", "heat vision", 25);
		Hero hero3 = new Hero("Potter", "magic", 18);
		System.out.println(hero1.toString());
		System.out.print("\n");
		System.out.println(hero2.toString());
		System.out.print("\n");
		System.out.println(hero3.toString());
		
		
		
	}

}
