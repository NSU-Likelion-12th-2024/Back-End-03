package Mento;
// 은행 계좌 관리 프로그램
/*
    조건 1. 은행 계좌를 나타내는 클래스 생성
    조건 1-1. 입금, 출금, 잔액 조회기능의 메소드 각각 구현
    조건 2. 반복문을 통해 사용자가 입금, 출금, 잔액조회를 할 수 있음
    조건 3. 입금, 출금, 잔액조회시 숫자가 아닌 게 들어가면 예외처리

    * 어떤 코드인지 어떻게 작동하는지 주석 필수

 */

import java.util.InputMismatchException;
import java.util.Scanner;

class BankAccount {

    // 잔액
    private int balance;

    // 생성자
    public BankAccount(int balance) {
        this.balance = balance;
    }

    // 입금 메소드
    public void deposit(int amount) {
        balance += amount;
    }

    // 출금 메소드
    public void withdraw(int amount) {
        balance -= amount;
    }

    // 잔액 조회 메소드
    public void checkTheBalance() {
        System.out.printf("현재 잔액은 %d원 입니다. \n", balance);
    }
}


public class Week09_mentoring_Ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(10000);  // 초기 금액은 10000원

        // 반복을 멈춰줄 변수 stop
        boolean stop = false;


        while (!stop) {
            try {
                choice();
                int serviceNumber = sc.nextInt();
                switch (serviceNumber) {
                    case 1:
                        System.out.println("얼마를 입금하시겠습니까? : ");
                        int amount_dp = sc.nextInt();
                        bankAccount.deposit(amount_dp);
                        bankAccount.checkTheBalance();
                        break;
                    case 2:
                        System.out.println("얼마를 출금하시겠습니까? : ");
                        int amount_wd = sc.nextInt();
                        bankAccount.withdraw(amount_wd);
                        bankAccount.checkTheBalance();
                        break;
                    case 3:
                        bankAccount.checkTheBalance();
                        break;
                    case 4:
                        System.out.println("프로그램을 종료합니다. ");
                        stop = true;
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 입력은 정수만!");
                        break;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("정수만 입력해라 ㅡㅡ ");
                sc.nextLine(); // Scanner 입력 버퍼 비우기
            }

        }


    }

    // 선택지 제시하는 메소드
    public static void choice() {
        System.out.println("========== 선택하세요 ==========");
        System.out.println("1. 입금하기");
        System.out.println("2. 출금하기");
        System.out.println("3. 잔액 조회");
        System.out.println("4. 종료");
        System.out.print("원하시는 서비스의 번호를 입력해주세요. : ");
    }
}
