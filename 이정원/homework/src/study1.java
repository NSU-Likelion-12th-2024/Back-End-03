import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int kor, mat, eng;

    Student(String name, int kor, int mat, int eng){
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;
    }
    int avg(){
        return (kor + mat + eng) / 3;
    }
    public void showPrice() {
        System.out.println(name + "성적 평균은" + avg() + "입니다.");
    }
}
public class study1 {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("봄", 70, 95, 34));
        students.add(new Student("겨울", 60, 45, 98));
        students.add(new Student("자바", 76, 91, 10));
        students.add(new Student("파이썬", 30, 73, 87));
        students.add(new Student("콜라", 90, 77, 43));

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요: ");
        String inputNum = scanner.next();
        System.out.println("총 인원은" + students.size() + "명입니다.");

        boolean found = false;
        for (Student student : students){
            if (student.name.equals(inputNum)){
                student.showPrice();
                found = true;
                break;
            }
        }
    }
}