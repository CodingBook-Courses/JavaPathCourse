import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Usr> users = new ArrayList<>();
        users.add(new Usr("Chintan", 24));
        users.add(new Usr("Tejasvi", 21));
        users.add(new Usr("Jaagrav", 12));

        Collections.sort(users, (user1, user2) -> user1.getName().compareTo(user2.getName()));

        for(Usr user : users) {
            System.out.println(user.getName());
        }

        String joinString = doConcatString(new LowerCase() {
            @Override
            public String toLowerCase(String one, String two) {
                return one.toLowerCase() + two.toLowerCase();
            }
        }, "Chintan", "Patel");

        System.out.println(joinString);

        Predicate<Usr> user;
        Function<String, Usr> getAge;
    }

    public final static String doConcatString(LowerCase funcInt, String one, String two) {
        return funcInt.toLowerCase(one, two);
    }

}

interface LowerCase {
    String toLowerCase(String one, String two);
}

class Usr {
    private String name;
    private Integer age;

    public Usr(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
