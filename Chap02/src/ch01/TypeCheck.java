package ch01;

public class TypeCheck {
	public static void main(String[] args) {
//		float f = 1.0000001f;
//		System.out.println(f);
//		float f2 = 1.00000001f;
//		System.out.println(f2);
//		
//		double a = 0.1;
//		double b = 0.2;
//		System.out.println(a+b);
		
		double a1 = 0.1;
		float a2 = 0.1f;
		System.out.printf("%.20f\n", a1);
		System.out.printf("%.20f\n", a2);
		
		
		System.out.println("------------------");
		float b1 = 1.2f;
		double b2 = -1.5;
		double c1 = 5;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(c1);
		
		
	}

}
