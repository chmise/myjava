package ch2;

public class ShortCircuitExam {
	public static void main(String[] args) {
		int a=-1, b=-1, c=-3;
		System.out.println(false && (5/++a)>6);
		System.out.println(true | (5/b++)>6);
		System.out.println(true ^ c++>6);
	}
}
