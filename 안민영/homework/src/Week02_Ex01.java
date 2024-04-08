
public class Week02_Ex01 {

    static String getHiddenData(String t, int index){

        String S = "*";

        switch (index){
            case 1:
                t = t.substring(0,1);
                t = t + S.repeat(2);
                break;

            case 8:
                t = t.substring(0,8);
                t = t + S.repeat(6);
                break;

            case 9:
                t = t.substring(0,9);
                t = t + S.repeat(4);
                break;
        }

        return t ;
    }
    public static void main(String[] args) {
        String name = "박교수";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
