package builder;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
@SuperBuilder
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private double weight;
    private double height;


    //    @Singular(value = "робота") //якщо ломбок не може створити однину
    @Singular
    private List<String> occupations;

    public static void main(String[] args) {
        User user = User.builder()
                .age(31)
                .name("Name")
                .occupation("UCU")
                .build();

        System.out.println(user);
        User user2 = User.builder()
                .occupations(List.of("UCU", "not UCU"))
                .occupation("Not not UCu")
                .build();
        System.out.println(user2);
//        User user = new User(1, "YourName", "ucu.edu@ua", 99, 199, 99);

    }
}
