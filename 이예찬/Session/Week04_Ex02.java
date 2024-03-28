package Session;

// 세션 과제 2번
// 반복 퀴즈내기.
import java.util.Scanner;
public class Week04_Ex02 {
    public static void main(String[] args) {
        boolean stop = false;
        Scanner sc = new Scanner(System.in);

        while (!stop) {
            showQuiz();
            System.out.print("당신의 정답을 입력해주세요 : ");
            int myAnswer = sc.nextInt();

            switch (myAnswer) {
                case 1:
                case 2:
                case 3:
                    System.out.println("땡! 틀렸습니다~");
                    break;
                case 4:
                    System.out.println("딩동댕~~~ 정답입니다~~~~🎉");
                    stop = true;
                    break;
                default:
                    System.out.println("이상한 입력인데요? 다시 입력해보세요. 1~4의 정수값만 입력하셔야 됩니다.");
                    break;
            }
        }
    }
    public static void showQuiz() {
        System.out.println("Q. 다음 중 프로그래밍 언어가 아닌 것은?");
        System.out.println("1. 자바");
        System.out.println("2. 파이썬");
        System.out.println("3. C언어");
        System.out.println("4. 멋쟁이사자처럼");
    }
}
