package com.webcode.kafkademo;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class ProducerService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(Message msg){
        kafkaTemplate.send("audits",msg.getMessage());
    }
}
