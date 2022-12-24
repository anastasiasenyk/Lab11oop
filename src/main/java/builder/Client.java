package builder;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
public class Client extends User{
    private String sex;

    public static void main(String[] args) {
        Client client = Client.builder()
                .sex("butterfly")
                .name("Name")
                .id(1)
                .build();
        System.out.println(client);
    }
}
