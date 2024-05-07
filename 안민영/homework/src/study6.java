import java.util.InputMismatchException;
import java.util.Scanner;

class Bank {
    private int Acount = 0;

    private int Sum = 0;


    public int getAcount() {
        return Acount;
    }

    public void setDeposit(int Deposit) {
        this.Sum = Deposit;
        Acount += Sum;
    }

    public void setWithdrawal(int Withdrawal) {
        this.Sum = Withdrawal;
        Acount -= Sum;
    }
}
public class study6 {
    public static void main(String[] args) {

        boolean on = true;
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (on)  {
            try {
                System.out.println("1.입금, 2.출금, 3.잔액 조회, 4.나가기");

                if (!sc.hasNextInt()) {
                    throw new InputMismatchException("숫자를 입력해주세요.");
                }

                int num = sc.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("====================");
                        System.out.println("입금 선택하셨습니다");
                        System.out.println("현재 계좌 잔액 " + bank.getAcount() + "원");
                        System.out.println("얼마를 입금 하시겠습니까?");
                        if (!sc.hasNextInt()) {
                            throw new InputMismatchException("숫자를 입력해주세요.");
                        }
                        int ds = sc.nextInt();
                        bank.setDeposit(ds);
                        System.out.println(ds + " 원 입금하셨습니다.");
                        System.out.println();
                        System.out.println("현재 계좌 잔액 " + bank.getAcount() + "원");
                        System.out.println("====================");
                        break;

                    case 2:
                        System.out.println("====================");
                        System.out.println("출금 선택하셨습니다");
                        System.out.println("현재 계좌 잔액 " + bank.getAcount() + "원");
                        System.out.println("얼마를 출금 하시겠습니까?");
                        if (!sc.hasNextInt()) {
                            throw new InputMismatchException("숫자를 입력해주세요.");
                        }
                        int wd = sc.nextInt();
                        bank.setWithdrawal(wd);
                        System.out.println(wd + " 원 출금하셨습니다.");
                        System.out.println();
                            System.out.println("현재 계좌 잔액 " + bank.getAcount() + "원");
                        System.out.println("====================");
                        break;

                    case 3:
                        System.out.println("====================");
                        System.out.println("잔액 조회 선택하셨습니다");
                        System.out.println("현재 계좌 잔액 " + bank.getAcount() + "원");
                        System.out.println("====================");
                        break;

                    case 4:
                        on = false;
                        break;

                    default:
                        System.out.println("1~4까지의 번호를 선택해주세요.");
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        sc.close();
    }
}
