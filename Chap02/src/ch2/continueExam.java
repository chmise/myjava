package ch2;

public class continueExam {
    public static void main(String[] args) {
        // 첫 번째 예제: 기본 continue
        System.out.println("기본 continue:");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j == 3)
                    continue; // j가 3일 때 이번 반복을 건너뜀
                System.out.println(i + ", " + j);
            }
        }
        
        System.out.println("---------------------");
        
        // 두 번째 예제: 레이블이 있는 continue
        System.out.println("레이블이 있는 continue:");
        POS1: for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(j == 3)
                    continue POS1; // j가 3일 때 외부 루프의 다음 반복으로 이동
                System.out.println(i + ", " + j);
            }
        }
    }
}