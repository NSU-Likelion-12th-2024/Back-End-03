import java.util.ArrayList;
import java.util.List;

public class Week03_Ex01 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        System.out.println("입력한 리스트의 홀수 값:");

        for (int i = 0 ; i <= 5; i++){
            if (list1.get(i) % 2 == 1){
                System.out.print(list1.get(i) + " ");
            }
        }
    }
}
