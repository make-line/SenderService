package com.example.senderservice.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
public class Message {
    String consumer;
    String name;
    String description;
    LocalDateTime timestamp;
    String okUrl;
    String cancelUrl;

}
