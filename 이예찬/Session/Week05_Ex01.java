package Session;
// 세션과제 1번 - ***로 바꾸기
public class Week05_Ex01{
    public static void main(String[] args) {
        String name = "박교수";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

    static String getHiddenData(String target, int startNum) {
        switch(startNum) {
            case 1:
                target = target.substring(0,1);
                target = target + "**";
                break;
            case 8:
                target = target.substring(0,7);
                target = target + "*******";
                break;
            case 9:
                target = target.substring(0, 9);
                target = target + "****";
                break;
        }
        return target;
    }
}