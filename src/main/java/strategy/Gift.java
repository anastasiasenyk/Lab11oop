package strategy;

public class Gift implements MailCode {
    private static String TEMPLATE = "Cyber Moday. Hi %NAME";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }

}
