package strategy;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MailInfo {
    private MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.mailCode = mailCode;
        this.client = client;
    }

    private Client client;

    public String generate(Client client) {
        return mailCode.generate(client);
    }

}
