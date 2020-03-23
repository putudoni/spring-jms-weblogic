/**
 * 
 */
package com.pnwd.spring.jms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pnwd.spring.jms.service.MessageSender;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
@Controller
public class SenderController {

	private MessageSender messageSender;
	
	@Autowired
	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	@RequestMapping(value = "/sender", method=RequestMethod.GET)
	public @ResponseBody String sender() {
		messageSender.sendMail();
		return "Messages sent successfully";
	}
	
}
