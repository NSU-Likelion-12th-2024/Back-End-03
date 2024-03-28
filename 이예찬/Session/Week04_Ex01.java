package Session;
// 세션 과제 1번
// 입력받은 단수 구구단 출력하기.

import java.util.Scanner;

public class Week04_Ex01 {
    public static void main(String[] args) {
        System.out.print("숫자 : ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        System.out.printf("===== %d단 =====\n", inputNumber);
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", inputNumber, i, inputNumber * i);
        }
    }
}