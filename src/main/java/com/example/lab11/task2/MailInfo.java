package com.example.lab11.task2;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder @ToString @Getter
public class MailInfo {
    public Client client;
    public MailCode mailCode;
    
    
    public String makeMail() {
        return mailCode.makeMail(client);
    };

    public String makeSubject() {
        return mailCode.makeSubject(client);
    }
    public String makeText() {
        return mailCode.makeText(client);
    }
    public String makeHTML() {
        return mailCode.makeHTML(client);
    }
    public String makeId() {
        return mailCode.makeId(client);
    }
}
