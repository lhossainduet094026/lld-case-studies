package association.socialNetwork;

public class Message {

	private User author;
	private String content;
	private String timestamp;

	public Message(User author, String content, String timestamp) {
		this.author = author;
		this.content = content;
		this.timestamp = timestamp;

		author.getMessages().add(this);
	}

	public User getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public String getTimestamp() {
		return timestamp;
	}
}
