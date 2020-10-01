import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {
        //Lambda Expressions: It's easier way to work with Interfaces which has only one method
        //Useful when we want to replace anonymous class

        //3 parts:
        //1) Arguments List (argument 1, argument 2)
        //2) Arrow tokens (->)
        //3) Body that you want to execute (function body)

        //Can only be used with one method interface implementation
        //This one method interface is sometimes called functional interfaces

        List<User> users = new ArrayList<>();
        users.add(new User("Chintan", 24));
        users.add(new User("Tejasvi", 21));
        users.add(new User("Sam", 27));
        users.add(new User("Michael", 15));
        users.add(new User("Sunday", 45));

//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        //f(a,b) -> a + b

        Collections.sort(users, (User user1, User user2) -> user1.getName().compareTo(user2.getName()));

        for(User user : users) {
            System.out.println(user.getName());
        }
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
