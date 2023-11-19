package demopkg;

public class First_String_Class {

	public static void main(String[] args) {
		First_String_Class Z = new First_String_Class();
		Z.T();
		First_String_Class.Z();
		First_String_Class.R();

	}

	public void T() {
		String a = "Sakif Sezan";
		boolean b = a.equals("Sakif");
		System.out.println(b);
	}
	
	static void Z() {
		String b = "Sezan sakif";
		boolean a = b.startsWith("Sezan");
		//boolean c = b.startsWith("Sakif");
		System.out.println(a);
		//System.out.println(c);
	}
	
	static void R() {
		String d = "Sakif Sezan";
		boolean e = d.startsWith("Z");
		System.out.println(e);
		
	}
}
