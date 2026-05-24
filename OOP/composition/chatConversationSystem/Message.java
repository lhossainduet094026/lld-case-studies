package composition.chatConversationSystem;

public class Message {

	private String senderName;
	private String text;
	private long timestamp;
	
	public Message(String senderName, String text) {
		this.senderName = senderName;
		this.text = text;
		this.timestamp = System.currentTimeMillis();
	}

	public void display() {
		System.out.println("senderName:" + senderName + " text:" + text + " timestamp:" + timestamp);
	}
}
