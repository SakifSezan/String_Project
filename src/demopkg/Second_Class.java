package demopkg;

public class Second_Class {

	public static void main(String[] args) {
		Second_Class TX = new Second_Class();
		TX.R();
		Second_Class FL = new Second_Class();
		
		FL.S();
		Second_Class.N();
		Second_Class NJ = new Second_Class();
		NJ.Z();
		Second_Class.L();
		
	}
	
	public void R() {
		
		String a = "I love Automation";
		boolean b = a.equals("I love Automation");
		System.out.println(b);
	}

	public void S() {
		
		String a = "I love Automation";
		boolean b = a.equals("I love automation");
		System.out.println(b);
	}

	
	public static void N() {
		
		String b = "Hello";
		boolean d = b.startsWith("Bello");
				System.out.println(d);
	}
	
	public void Z() {
		
		String R = "America is Great";
		boolean h = R.endsWith("Great");
				System.out.println(h);
	}
	
	public static void L() {
		
		String W = "Selenium";
		boolean S = W.equalsIgnoreCase("selenium");
		System.out.println(S);
	}
}
