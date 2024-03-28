package Mento;

// 멘토링 과제 1번
// 다이아몬드 모양으로 별 찍기 (feat. ChatGPT).

import java.util.Scanner;

public class Week04_mentoring_Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("다이아몬드 위쪽 삼각형 높이를 입력하세요 : ");

        int height = sc.nextInt();

        // 위쪽 삼각형 출력
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형 출력
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}