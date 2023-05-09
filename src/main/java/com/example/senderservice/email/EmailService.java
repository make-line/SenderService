package com.example.senderservice.email;


import com.example.senderservice.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;
    public void sendEmail(Message in){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("dmharit@yandex.ru");
        message.setTo(in.getConsumer());
        message.setSubject(in.getName());
        message.setText(in.getDescription());
        emailSender.send(message);
    }
}
