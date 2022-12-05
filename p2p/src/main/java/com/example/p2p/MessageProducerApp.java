package com.example.p2p;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.p2p.config.AppConfig;
import com.example.p2p.producer.MessageSender;

public class MessageProducerApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        MessageSender messageSender = context.getBean(MessageSender.class);

        messageSender.sendMessage("Halo Consumer");
        System.out.println("Message has been send successfully...");

        ((AbstractApplicationContext) context).close();
    }

}