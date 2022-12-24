import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proxy.ProxyImage;
import strategy.Client;
import strategy.MailBox;
import strategy.MailCode;
import strategy.MailInfo;

public class TestProxy {
    private ProxyImage proxy;

    @Test
    public void testCorrectImage() {
        ProxyImage proxyImage = new ProxyImage("imagee.jpeg");
        proxyImage.display();
    }

}
