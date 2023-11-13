package com.example.lab11.task2;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;

import lombok.Builder;
import lombok.ToString;

@Builder @ToString
public class MailSender {
    public static void sendMail(MailInfo mail) throws MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        ClientOptions options =
        ClientOptions.builder().apiKey("26d1207f45fc749479ec51af14626484").apiSecretKey("13df4854f85a1db634e00198861f4b69").build();
        client = new MailjetClient(options);
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", mail.getClient().getMail())
                                        .put("Name", mail.getClient().getMail())
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mail.getClient().getMail())
                                                .put("Name", mail.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, mail.makeSubject())
                                .put(Emailv31.Message.TEXTPART, mail.makeText())
                                .put(Emailv31.Message.HTMLPART, mail.makeHTML())
                                .put(Emailv31.Message.CUSTOMID, mail.makeId()))));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
