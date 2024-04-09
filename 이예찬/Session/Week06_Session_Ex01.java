package Session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    private String name;
    private int level;
    private int power;

    public User(String name, int level, int power) {
        this.name = name;
        this.level = level;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getPower() {
        return power;
    }
}

public class Week06_Session_Ex01 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("James", 10, 3000),
                new User("Alice", 20, 4000),
                new User("Thomas", 15, 3500)
        );

        // 이름들만 출력해줄 스트림 생성 및 스트림 연산
        System.out.println("[User Name]");
        users.stream()
                .map(user -> user.getName())    // 함수형 인터페이스 사용 시 : .map(User::getName)
                .forEach(System.out::println);  // 함수형 인터페이스 미사용 시 : .forEach(userName -> System.out.println(userName))

        // Power만 뽑아 합계를 내주는 스트림 생성 및 연산. mapToInt를 통해 바로 IntStream타입으로 바꿀 수 있음.
        int powerSum = users.stream().mapToInt(User::getPower).sum();   // 주의 : sum()메서드는 IntStream에서만 지원하는 메서드. Stream<Integer>에는 호출 불가능.
        System.out.println("\n[User Power 합계]");
        System.out.println(powerSum);

        // level이 15 이상인 유저만 출력하기. 레벨 기준 내림차순 정렬.
        System.out.println("\n[User Level 15 이상]");
        users.stream()
                .filter(user -> user.getLevel() >= 15)  // 주의 : 필터링의 결과가 level수치가 아님. level수치를 기준으로 객체를 걸러낸 것. 결과도 조건에 맞는 객체가 남아있음.
                .sorted((current, next) -> next.getLevel() - current.getLevel())  // 다음 요소의 레벨 - 포커싱중인 요소의 레벨을 비교. 비교를 돕기 위해 존재하는 Comparator 인터페이스의 함수를 람다식으로 오버라이딩하는것이다. 결과물은 역시나 객체(User)로 이루어짐.
                .map(user -> user.getName())    //여기서 각 객체가 해당 요소의 이름(String)으로 매핑되며, 이 이후로는 스트림의 요소가 String임.
                .forEach(System.out::println);
    }
}
