/**
 * 
 */
package com.pnwd.spring.jms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
@Controller
public class SenderController {

	@RequestMapping(value = "/sender", method=RequestMethod.GET)
	public @ResponseBody String sender() {
		return "sender";
	}
	
}
