package strategy;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public MailInfo(Client client, MailCode mailCode) {
        this.mailCode = mailCode;
        this.client = client;
    }

    public String generate(Client client) {
        return mailCode.generate(client);
    }

}
