package com.chat.app.models;

public class Message {
	public String name;
	public String content;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
	
}
