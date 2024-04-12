import java.util.ArrayList;
import java.util.Scanner;

class Student{

    String name;

    int kor, mat, eng;

    Student(String name,int kor, int mat, int eng){
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;
    }
    int avg(){
        return (kor + mat + eng) / 3;
    }
}

public class study4 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner name = new Scanner(System.in);

        students.add(new Student("민영", 90, 100, 90));
        students.add(new Student("승현", 72, 85, 32));
        students.add(new Student("정원", 70, 70, 90));
        students.add(new Student("수빈", 73, 73, 80));
        students.add(new Student("민석", 80, 85, 88));

        System.out.println("총 인원은 " + students.size() + "명 입니다.");

        System.out.println("평균을 검색할 사람의 이름을 입력하세요");

        String Name = name.next();

        boolean found = false;

        for (Student student : students) {
            if (Name.equals(student.name)) {
                int average = student.avg();
                System.out.println(student.name + "의 평균은 " + average);
                found = true;
                break;
            }
        }
    }
}