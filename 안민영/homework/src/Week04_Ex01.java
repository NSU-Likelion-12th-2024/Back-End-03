import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User{
    String Name;
    int Level;
    int Power;

    public User(String Name, int Level, int Power) {
        this.Name = Name;
        this.Level = Level;
        this.Power = Power;
    }

    public String getName() {
        return this.Name;
    }
    public int getLevel() {
        return this.Level;
    }
    public int getPower() {
        return this.Power;
    }
}
public class Week04_Ex01 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("james", 10, 3000),
                new User("alice", 20, 4000),
                new User("thomas", 15, 3500)
        );

        System.out.println("[user name]");
        users.stream()
                .map(User::getName)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("[user power 합계]");
        int totalPower = users.stream()
                .mapToInt(User::getPower)
                .sum();
        System.out.println(totalPower);
        System.out.println();

        System.out.println("[user level 15 이상]");
        users.stream()
                .filter(user -> user.getLevel() >= 15)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
