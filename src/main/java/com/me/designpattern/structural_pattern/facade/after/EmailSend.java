package com.me.designpattern.structural_pattern.facade.after;

import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class EmailSend {

    public void send(EmailMessage emailMessage){

        try {
            MimeMessage message = emailMessage.getMessage();
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException("잘못된 문제.");
        }

    }
}
