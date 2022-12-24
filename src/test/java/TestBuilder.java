import builder.Client;
import org.junit.jupiter.api.Test;

public class TestBuilder {
    @Test
    public void testBuild(){
        builder.Client client1 = Client.builder()
                .sex("butterfly")
                .name("Name")
                .id(1)
                .build();
        builder.Client client2 = Client.builder()
                .id(1)
                .sex("butterfly")
                .name("Name")
                .build();
    }
}
