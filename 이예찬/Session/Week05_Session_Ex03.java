package Session;
// 5주차 수요일 세션과제
// 리스트에서 홀수 값을 출력하는 프로그램
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week05_Session_Ex03 {
    public static void main(String[] args) {

        //리스트 생성해서 하나하나 넣기
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        //Integer타입 배열 만든 후 asList()함수로 리스트로 변환하기
        Integer[] intArr1 =  {5, 6, 7, 8, 9};
        List<Integer> intList1 = Arrays.asList(intArr1);

        System.out.println(list1);
        System.out.println(intList1);

        System.out.println("입력한 리스트의 홀수 값 : ");
        for(int i = 0; i <= list1.size() - 1; i++) {
            if(list1.get(i) % 2 == 1) {
                System.out.print(list1.get(i) + " ");
            }
        }
    }
}
