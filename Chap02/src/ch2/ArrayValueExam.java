package ch2;

public class ArrayValueExam {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1; arr[0] = 2; arr[0] = 3;
		
		System.out.println(arr[0]);
		//생성과 동시에 초기값으로 배열 생성
		int[] arr2 = {1,2,3};
		System.out.println(arr2[0]);
		//변수 선언 후, 객체 생성과 값 저장
		int[] arr3;
		arr3 = new int[] {4,5,6};
		System.out.println(arr3[0]);
	}
}