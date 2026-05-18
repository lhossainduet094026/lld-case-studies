package association.socialNetwork;

public class SocialNetworkApp {

	public static void main(String[] args) {

		User alice = new User("alice");
		User bob = new User("bob");
		User charlie = new User("charlie");

		alice.follow(bob);
		alice.follow(charlie);
		bob.follow(alice);

		System.out.println("-------alice following--------");
		
		for (User user : alice.getFollowing()) {
			System.out.println(user.getName());
		}
		
		System.out.println("-------bob following--------");
		
		for (User user : bob.getFollowing()) {
			System.out.println(user.getName());
		}
		
		 System.out.println(bob.getName() + "'s followers:");
	        for (User u : bob.getFollowers())
	            System.out.println("  - " + u.getName());
	}

}
