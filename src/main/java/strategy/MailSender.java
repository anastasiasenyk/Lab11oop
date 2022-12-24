package strategy;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;


public class MailSender {
    public static void main(String[] args) throws MailjetException, MailjetSocketTimeoutException {
        Client myClient = new Client("Mousey", "anastasiia.senyk@ucu.edu.ua", 21, "FEMALE");
        MailInfo mailInfo = new MailInfo(myClient, new Gift());

        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("41ecc63d03a6585039f6ead96df87ff9", "859781f322ca6a974633af221dde21d3", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "anastasiia.senyk@ucu.edu.ua")
                                        .put("Name", "Anastasiia"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", myClient.getEmail())
                                                .put("Name", myClient.getName())))
                                .put(Emailv31.Message.SUBJECT, "Greetings!")
                                .put(Emailv31.Message.HTMLPART, mailInfo.generate(myClient))));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}

