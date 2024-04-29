import java.util.Scanner;

interface ArithmeicOperation{
    int calculate(int a, int b) throws ArithmeticException;
}

public class study2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("두가지 숫자를 입력하세요:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            ArithmeicOperation addition = (a, b) -> a+b;
            ArithmeicOperation subtraction = (a, b) -> a-b;
            ArithmeicOperation multiplication = (a, b) -> a*b;
            ArithmeicOperation division = (a, b) -> {
                if (b==0){
                    throw new ArithmeticException("나누기는 0으로 할 수 없겠죠?");
                }
                return a/b;
            };
            System.out.println("두 숫자의 합은" + performOperation(addition, num1, num2));
            System.out.println("두 숫자의 합은" + performOperation(subtraction, num1, num2));
            System.out.println("두 숫자의 합은" + performOperation(multiplication, num1, num2));
            System.out.println("두 숫자의 합은" + performOperation(division, num1, num2));
        }catch (Exception e){
            System.out.println(e);
            main(args);
        }
    }
    private static int performOperation(ArithmeicOperation operation, int a, int b) {
        return operation.calculate(a, b);
    }
}