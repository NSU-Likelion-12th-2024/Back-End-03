package Mento;

// 멘토링 과제 2번
// 메뉴판에서 선택한 메뉴 뭔지 알려주기.

import java.util.Scanner;

public class Week04_mentoring_Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;

        while(!stop) {
            menuInfo();
            int myAnswer = sc.nextInt();

            switch (myAnswer) {
                case 1:
                    System.out.println("아메리카노 입니다.");
                    break;
                case 2:
                    System.out.println("카페라떼 입니다.");
                    break;
                case 3:
                    System.out.println("아이스티 입니다.");
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    stop = true;
                    break;
                default:
                    System.out.println("잘못된 번호입니다.");
                    break;
            }
        }



    }

    public static void menuInfo() {
        System.out.println("===============");
        System.out.println("카페 메뉴판");
        System.out.println("1. 아메리카노");
        System.out.println("2. 카페라떼");
        System.out.println("3. 아이스티");
        System.out.println("4. 메뉴판 나가기");
        System.out.println("===============");
        System.out.print("메뉴를 선택해 주세요 : ");
    }
}