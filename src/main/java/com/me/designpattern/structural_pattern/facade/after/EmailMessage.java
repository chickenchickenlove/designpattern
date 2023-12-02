package com.me.designpattern.structural_pattern.facade.after;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailMessage {

    private final String from;
    private final String to;
    private final String subject;
    private final String text;
    private final EmailSetting emailSetting;

    public EmailMessage(String from,
                        String to,
                        String subject,
                        String text,
                        EmailSetting emailSetting) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.text = text;
        this.emailSetting = emailSetting;
    }

    public MimeMessage getMessage() throws MessagingException {
        MimeMessage message = new MimeMessage(this.emailSetting.getSession());
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("Test Mail from Java Program");
        message.setText("message");
        return message;
    }
}
