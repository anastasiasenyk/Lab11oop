package proxy;

public class Main {
    public static void main(String[] args) {
//        RealImage myimage = new RealImage("imagee.jpeg");
//        myimage.display();

        ProxyImage proxyImage = new ProxyImage("imagee.jpeg");
        proxyImage.display();
    }
}
