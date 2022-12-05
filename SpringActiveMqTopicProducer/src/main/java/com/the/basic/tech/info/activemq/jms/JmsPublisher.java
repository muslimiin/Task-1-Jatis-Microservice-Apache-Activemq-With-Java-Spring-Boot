package com.the.basic.tech.info.activemq.jms;

// import java.sql.Date;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
// import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.the.basic.tech.info.activemq.models.Company;

@Component
public class JmsPublisher {
	private static final Logger logger = LoggerFactory.getLogger(JmsPublisher.class);
	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${jsa.activemq.topic}")
	String topic;

	public void send(Company apple) {
		jmsTemplate.convertAndSend(topic, apple);
		logger.info("Message : {} published to topic: {} successfully.", apple.toString(), topic);
	}
}