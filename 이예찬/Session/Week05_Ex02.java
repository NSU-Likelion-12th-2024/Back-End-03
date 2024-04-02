package Session;
class Hamburger {
    public void cook() {
        System.out.println("햄버거를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class CheeseBurger extends Hamburger {
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpBurger extends Hamburger {
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
public class Week05_Ex02 {
    public static void main(String[] args) {

        Hamburger[] hamburgers = new Hamburger[3];
        hamburgers[0] = new Hamburger();
        hamburgers[1] = new CheeseBurger();
        hamburgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("--------------------");
        for(Hamburger hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("--------------------");
        }
    }
}
