/**
 * 
 */
package com.pnwd.spring.jms.service;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
public class MessageSender {

	private JmsTemplate jmsTemplate;
	
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void sendMail() {
		jmsTemplate.send("jms/springQueue01", new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				MapMessage message = session.createMapMessage();
				message.setString("name", "james");
				message.setString("email", "james@mail.com");
				return message;
			}
		});
	}

}
