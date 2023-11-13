package com.example.lab11.task2;

public interface MailCode {
    public String makeMail(Client client);
    public String makeSubject(Client client);
    public String makeText(Client client);
    public String makeHTML(Client client);
    public String makeId(Client client);
}
