package org.newbeess.mail.sender.service;

public interface MailService {

    boolean sendSimpleMail(String to, String subject, String body);
}
