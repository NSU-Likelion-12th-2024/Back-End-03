class HamBurger {
    String name = "HamBurger";
    String Material1 = "양상추";
    String Material2 = "패티";
    String Material3 = "피클";
    public void cook() {
        System.out.println("햄버거를 만듭니다");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> " + Material1);
        System.out.println("+ " + Material2);
        System.out.println("+ " + Material3);
    }
}

class CheeseBurger extends HamBurger {
    String name = "CheeseBurger";
    public void cook() {
        System.out.println("치즈버거를 만듭니다");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> " + Material1);
        System.out.println("+ " + Material2);
        System.out.println("+ " + Material3);
        System.out.println("+ 치즈");
    }
}

class ShrimpBurger extends HamBurger {
    String name = "ShrimpBurger";
    public void cook() {
        System.out.println("새우버거를 만듭니다");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> " + Material1);
        System.out.println("+ " + Material2);
        System.out.println("+ " + Material3);
        System.out.println("+ 새우");
    }
}
public class Week02_Ex02 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("---------------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("-------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
