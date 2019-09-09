package springboot.xml_config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.xml_config.service.MessageProviderService;

@RestController
public class MessageProviderController {
	
	@Autowired
	private MessageProviderService messageProviderService;
	
	public void setMessageProviderService(MessageProviderService messageProviderService) {
		this.messageProviderService = messageProviderService;
	}
	
	@GetMapping("/")	
	public String helloworld() {
		return messageProviderService.getMessage();
	}
}
