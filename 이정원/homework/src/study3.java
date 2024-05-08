
import java.util.Scanner;

class Bank{
    private double money;

    public Bank(){
        money = 0;
    }
    public void deposit(double a){
        money += a;
        System.out.println(a + "원 입금");
    }
    public void wihtdraw(double a){
        money -= a;
        System.out.println(a + "원 출금");
    }
    public double ccount(){
        return money;
    }
}
public class study3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank account = new Bank();

        while (true){
            System.out.println("입금 || 출금 || 잔액조회 || 종료" );
            System.out.println("무엇을 원하시나요?:");
            String you = scanner.next();

            if (you.equals("입금")){
                System.out.println("입금 금액:");
                try {
                    double amount = Double.parseDouble(scanner.next());
                    account.deposit(amount);
                } catch (NumberFormatException e) {
                    System.out.println("다시 시도해주세요.");
                }
            }else if (you.equals("출금")){
                System.out.println("출금 금액:");
                try {
                    double amount = Double.parseDouble(scanner.next());
                    account.wihtdraw(amount);
                } catch (NumberFormatException e) {
                    System.out.println("다시 시도해주세요.");
                }
            }else if (you.equals("잔액조회")) {
                System.out.println("현재 잔액은 " + account.ccount());
            }else if (you.equals("종료")) {
                System.out.println("종료");
                scanner.close();
                break;
            }
        }
    }
}