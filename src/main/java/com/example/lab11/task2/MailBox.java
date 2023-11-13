package com.example.lab11.task2;

import java.util.List;

import com.mailjet.client.errors.MailjetException;

public class MailBox {
    private List<MailInfo> infos;
    
    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }
    
    public void sendAll() throws MailjetException {

        for (MailInfo info : infos) {
            MailSender.sendMail(info);
        }
    }
    
}
