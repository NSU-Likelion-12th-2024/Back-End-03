package Mento;

import java.util.Scanner;

interface Calculator {
    int operate(int num1, int num2);
}

public class Week06_mentoring_Ex01 {
    public static void main(String[] args) {


        Calculator sum = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> {
            if (y != 0) {
                return x / y;
            } else {
                throw new ArithmeticException("0으로 나누겠다고?"); // 예외 생성해 호출부로 던지기
            }
        };

        for (int i = 0; i < 3; i++) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("공백을 사이에 두고 두 정수를 입력해보세요. : ");
                String inputString = sc.nextLine();
                String[] inputNumbers = inputString.split(" ");

                int num1 = Integer.parseInt(inputNumbers[0]);
                int num2 = Integer.parseInt(inputNumbers[1]);

                System.out.println("두 숫자의 합은 " + sum.operate(num1, num2));
                System.out.println("두 숫자의 차는 " + sub.operate(num1, num2));
                System.out.println("두 숫자의 곱은 " + mul.operate(num1, num2));
                try {
                    System.out.println("두 숫자의 몫은 " + div.operate(num1, num2));
                } catch (ArithmeticException e) {   // 만약 생성된 ArithmeticException 예외를 받았다면 아래 출력문 실행.
                    System.out.println("나누기는 0으로 할 수 없겠죠?");
                }
            } catch (NumberFormatException e) { //정수가 아닌 값을 parseInt하여 저장하려 할 시 발생하는 예외 처리
                System.out.println("문자는 입력받을 수 없습니다.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("잘못된 인덱스 범위 접근 예외 발생 ( 입력 시 발생 예상됨 )");
            }

            System.out.println();
        }
    }
}
