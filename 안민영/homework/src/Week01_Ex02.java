import  java.util.Scanner;
public class Week01_Ex02 {
    public static void main(String [] args) {

        Scanner answer = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            System.out.println("Q. 다음 중 프로그래밍 언어가 아닌 것은");
            System.out.println("1. 자바");
            System.out.println("2. 파이썬");
            System.out.println("3. C언어");
            System.out.println("4. 멋쟁이사자처럼");

            int inputanswer = answer.nextInt();

            String result = inputanswer == 4 ? "정답" : "오답";
            System.out.println(result);

            i = inputanswer == 4 ? i += 1 : i ;
        }
    }
}
