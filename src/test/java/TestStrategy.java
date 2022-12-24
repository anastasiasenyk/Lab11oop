import org.junit.jupiter.api.Test;
import strategy.Client;
import strategy.MailBox;
import strategy.MailCode;
import strategy.MailInfo;

public class TestStrategy {
    @Test
    public void testMailBox() {
        MailBox mb = new MailBox();
        Client cl = new Client("Name", "emailName", 31, "f");
        MailInfo mi = new MailInfo(cl, new MailCode() {
            @Override
            public String generate(Client client) {
                return null;
            }
        });
    }
}
