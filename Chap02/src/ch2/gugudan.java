package ch2;

import java.util.Scanner; // Scanner 사용을 위한 import

public class gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        
        System.out.print("출력하고 싶은 단을 입력하세요 (2-9): ");
        int dan = scanner.nextInt(); // 사용자로부터 정수 입력받기
        
        // 입력값 유효성 검사
        if (dan >= 2 && dan <= 9) {
            System.out.println(dan + "단:");
            for(int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %2d%n", dan, i, (dan * i));
            }
        } else {
            System.out.println("2에서 9 사이의 숫자를 입력해주세요.");
        }
        
        scanner.close(); // Scanner 닫기 (리소스 누수 방지)
    }
}
