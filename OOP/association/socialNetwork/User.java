package association.socialNetwork;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private List<User> followers = new ArrayList<>();
	private List<User> following = new ArrayList<>();
	private List<Message> messages = new ArrayList<>();

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<User> getFollowers() {
		return followers;
	}

	public List<User> getFollowing() {
		return following;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void follow(User user) {

		// self follow guard
		if (this == user) {
			return;
		}

		if (!following.contains(user))
			following.add(user);

		user.getFollowers().add(this);

	}

	public void sendMessage(String content, String timestamp) {

		new Message(this, content, timestamp);

	}
}
