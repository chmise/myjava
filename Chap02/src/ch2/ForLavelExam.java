package ch2;

public class ForLavelExam {
    public static void main(String[] args) {
        // 첫 번째 예제: 기본 중첩 for 루프
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j == 3)
                    break; // j가 3일 때 내부 루프 종료
                System.out.println(i + ", " + j);
            }
        }
        System.out.println("---------------------");
        
        // 두 번째 예제: 레이블을 사용한 중첩 for 루프
        out: for(int i = 0; i < 5; i++) { // 레이블 'out' 선언 후 for문 시작
            for(int j = 0; j < 5; j++) {
                if(j == 3)
                    break out; // j가 3일 때 외부 루프까지 종료
                System.out.println(i + ", " + j);
            }
        }
        System.out.println("---------------------");
    }
}