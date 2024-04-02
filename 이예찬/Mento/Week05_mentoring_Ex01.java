package Mento;

// 5주차 멘토링과제 1번
// getter, setter, 메서드 사용하기

class User {
    private String id;
    private String pw;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
        System.out.println("비밀번호가 설정되었습니다.");
    }

    public void signUp(String id, String pw) {
        System.out.println("아이디는 " + id + " 비밀번호는 " + pw);
    }
}

public class Week05_mentoring_Ex01 {
    public static void main(String[] args) {

        User user = new User();

        user.setPw("1234");

        user.signUp("abcd", user.getPw());

    }
}
