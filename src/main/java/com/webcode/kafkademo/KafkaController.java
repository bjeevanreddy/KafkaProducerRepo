package com.webcode.kafkademo;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
@RequestMapping("api/v1/")
public class KafkaController {

    @Autowired
     ProducerService producerService;

    @PostMapping("publish")
    public void sendMessage(@RequestBody Message msg){
        producerService.sendMessage(msg);
    }

}
