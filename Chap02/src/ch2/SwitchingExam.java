package ch2;

public class SwitchingExam {
	public static void main(String[] args) {
		int time = 12;
		
		switch(time) {
		case 7: System.out.println("기상"); break;
		case 8: System.out.println("등교"); break;
		case 9: System.out.println("수업"); break;
		case 12: System.out.println("식사"); break;
		default: System.out.println("휴식"); 
		}
	}
}
