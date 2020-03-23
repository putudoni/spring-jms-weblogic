/**
 * 
 */
package com.pnwd.spring.jms.service;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
public class MessageReceiver implements MessageListener{

	@Override
	public void onMessage(Message message) {
		try {
			MapMessage mapMessage = (MapMessage) message;
			System.out.println("============================== Receive Message ==============================");
			System.out.println("name : "+mapMessage.getString("name").toString());
			System.out.println("email : "+mapMessage.getString("email").toString());
			System.out.println("============================== Receive Message ==============================");
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
