package composition.chatConversationSystem;

import java.util.ArrayList;
import java.util.List;

public class Conversation {

	private String title;
	private List<Message> messages;

	public Conversation(String title) {
		this.title = title;
		this.messages = new ArrayList<>();
	}

	public void sendMessage(String sender, String text) {

		Message message = new Message(sender, text);
		messages.add(message);

	}

	public void printHistory() {
		messages.forEach(message -> {
			message.display();
		});
	}

	public void delete() {
		messages.clear();
	}

	public int getMessageCount() {
		return messages.size();
	}
}
