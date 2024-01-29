package com.stefancipe.dpatterns.mediator;

public class ChatUser {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void sendMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
	
}
