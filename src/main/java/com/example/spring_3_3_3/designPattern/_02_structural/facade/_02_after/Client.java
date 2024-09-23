package com.example.spring_3_3_3.designPattern._02_structural.facade._02_after;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("sender");
        emailMessage.setTo("receiver");
        emailMessage.setCc("cc");
        emailMessage.setSubject("send mail");
        emailMessage.setText("test test");

        emailSender.sendEmail(emailMessage);
    }
}
