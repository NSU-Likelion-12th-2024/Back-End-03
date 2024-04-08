import java.util.Scanner;
public class study2 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        while(i != 1) {

            System.out.println("================");
            System.out.println("카페 메뉴판");
            System.out.println("1. 아메리카노");
            System.out.println("2. 카페라떼");
            System.out.println("3. 아이스티");
            System.out.println("4. 메뉴판 나가기");
            System.out.println("================");
            System.out.println("메뉴를 선택해주세요");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("아메리카노 입니다");
                    break;
                case 2:
                    System.out.println("카페라떼 입니다");
                    break;
                case 3:
                    System.out.println("아이스티 입니다");
                    break;
                case 4:
                    System.out.println("종료");
                    break;
            }

            if (num == 4) {
                i++;
            }
            else{
                i = 0;
            }

        }
    }
}
