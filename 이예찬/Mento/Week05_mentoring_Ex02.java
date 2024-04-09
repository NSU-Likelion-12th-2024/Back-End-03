package Mento;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int kor, mat, eng;

    Student(String name, int kor, int mat, int eng) {
        this.name = name;
        this.kor = kor;
        this.mat = mat;
        this.eng = eng;
    }

    int avg() {
        return (kor + mat + eng) / 3;
    }
}

public class Week05_mentoring_Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        students.add(new Student("예찬", 100, 90, 80));
        students.add(new Student("원준", 90, 85, 100));
        students.add(new Student("민영", 100, 100, 100));
        students.add(new Student("정원", 90, 90, 90));
        students.add(new Student("길동", 50, 60, 70));

        System.out.printf("총 인원은 %d명 입니다.\n", students.size());

        System.out.print("점수의 평균이 궁금한 사람의 이름을 입력하세요 : ");

        boolean found = false;  // 입력한 이름과 리스트 내 일치하는 이름이 있는지 여부를 저장할 변수

        String inputName = sc.nextLine();

        for (Student student : students) {
            if (inputName.equals(student.name)) {
                int average = student.avg();
                System.out.println(student.name + "의 평균은 " + average);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("입력하신 이름은 없는 이름입니다.");
        }

    }
}

