package com.me.designpattern.structural_pattern.facade.after;

import javax.mail.Session;
import java.util.Properties;

public class EmailSetting {
    private final Properties properties;

    public EmailSetting(String host) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        this.properties = properties;
    }

    public Session getSession() {
        return Session.getDefaultInstance(this.properties);
    }
}
