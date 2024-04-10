import java.util.ArrayList;
import java.util.List;

public class Week03_Ex01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println("입력한 리스트의 홀수 값: ");
        for (int number : numbers){
            if (number % 2 !=0) {
                System.out.println(number + " ");
            }
        }
    }
}
