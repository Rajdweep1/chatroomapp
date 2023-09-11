package com.chat.app.models;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	@SendTo("/topic/return-to")
	@MessageMapping("/message")
	public Message getContent(@RequestBody Message message) {
		return message;
	}
}
