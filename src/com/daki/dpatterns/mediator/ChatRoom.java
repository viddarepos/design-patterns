package com.stefancipe.dpatterns.mediator;

import java.util.Date;

public class ChatRoom {
	
	private ChatRoom() {}
	
	public static void showMessage(ChatUser user, String message) {
		System.out.println(new Date().toString() + "[" + user.getUsername() +"] : " + message);
	}
}
