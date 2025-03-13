package ch2;

public class shiftExam {
	public static void main(String[] args) {
		
		String a = new String("안녕");
		String b = new String("안녕");
		
		//단순 비교 주소 + 내용을 비교하기에 다르게 나옴
		System.out.println(a==b);
		
		//해쉬는 같다
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//heap 주소 비교
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		//내용 동등성 비교
		System.out.println(a.equals(b));
		
	}

}
