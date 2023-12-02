package com.me.designpattern.structural_pattern.facade.after;



public class Client {

    public static void main(String[] args) {
        String to = "keesun@whiteship.me";
        String from = "whiteship@whiteship.me";
        String host = "127.0.0.1";
        String subject = "Test Mail from Java Program";
        String text = "message";

        EmailSetting emailSetting = new EmailSetting(host);
        EmailMessage emailMessage = new EmailMessage(
                from,
                to,
                subject,
                text,
                emailSetting);

        EmailSend emailSend = new EmailSend();
        emailSend.send(emailMessage);

    }
}