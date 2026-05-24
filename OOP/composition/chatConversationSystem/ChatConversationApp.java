package composition.chatConversationSystem;

public class ChatConversationApp {

	public static void main(String[] args) {

		Conversation teamChat = new Conversation("Team Discussion");
		Conversation projectChat = new Conversation("Project Alpha");

		teamChat.sendMessage("Alice", "Hey team, standup in 5 minutes");
		teamChat.sendMessage("Bob", "Got it, joining now");
		teamChat.sendMessage("Alice", "Don't forget to update your tasks");

		projectChat.sendMessage("Charlie", "Deployment is scheduled for Friday");

		System.out.println("Before deletion:");
		teamChat.printHistory();
		System.out.println("Project chat has " + projectChat.getMessageCount() + " messages\n");

		// Delete team chat - all its messages are destroyed
		teamChat.delete();
		System.out.println("\nAfter deleting team chat:");
		System.out.println("Team chat has " + teamChat.getMessageCount() + " messages");
		System.out.println("Project chat still has " + projectChat.getMessageCount() + " messages");
	}

}
