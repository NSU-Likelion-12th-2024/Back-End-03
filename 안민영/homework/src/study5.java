import java.util.Scanner;

// 1. 사칙연산 인터페이스 정의
interface ArithmeticOperation {
    int operate(int x, int y);
}

public class study5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("두 숫자를 입력하세요");
                String[] input = scanner.nextLine().split(" ");
                if (input.length != 2) {
                    throw new IllegalArgumentException("잘못된 입력입니다. 두 개의 숫자를 공백으로 구분하여 입력하세요.");
                }
                int num1 = Integer.parseInt(input[0]);
                int num2 = Integer.parseInt(input[1]);

                // 예외처리 및 연산 수행
                ArithmeticOperation addition = (x, y) -> x + y;
                ArithmeticOperation subtraction = (x, y) -> x - y;
                ArithmeticOperation multiplication = (x, y) -> x * y;
                ArithmeticOperation division = (x, y) -> {
                    if (y == 0) {
                        throw new ArithmeticException("나누기는 0으로 할 수 없겠죠?");
                    }
                    return x / y;
                };

                System.out.println("두 숫자의 합은 " + addition.operate(num1, num2));
                System.out.println("두 숫자의 차는 " + subtraction.operate(num1, num2));
                System.out.println("두 숫자의 곱은 " + multiplication.operate(num1, num2));
                System.out.println("두 숫자의 몫은 " + division.operate(num1, num2));
                break; // 입력이 정상이므로 무한 루프 종료
            } catch (NumberFormatException e) {
                System.out.println("문자는 입력받을 수 없습니다.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("알 수 없는 예외 발생:");
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}

