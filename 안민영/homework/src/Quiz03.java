class SignUp{
    private String password;
    String userId;

    public void signUp(String userId, String getPassword){
        this.userId = userId;
        System.out.println("아이디는 " + userId + " 비밀번호는 " + getPassword);
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("비밀번호가 설정되었습니다");
    }
    public String getPassword(){
        return password;
    }
}

public class Quiz03 {
    public static void main(String[] args) {
        SignUp signUp = new SignUp();

        signUp.setPassword("1234");

        signUp.signUp("abcd", signUp.getPassword());
    }
}
