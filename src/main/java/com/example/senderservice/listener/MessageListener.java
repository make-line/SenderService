package com.example.senderservice.listener;

import com.example.senderservice.email.EmailService;
import com.example.senderservice.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j

public class MessageListener {
    private final EmailService emailService;
    @KafkaListener(id = "class-level", topics = "tg", containerFactory = "messageKafkaListenerContainerFactory")
    @KafkaHandler
    void listener(Message message) {
        System.out.println(message);
        emailService.sendEmail(message);
    }
}
