package com.example.p2p.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.example.p2p")
@Import({ MessagingConfiguration.class })
public class AppConfig
{

}
