package builder.emailBuilder;

public class MainApp {

	public static void main(String[] args) {

		 Email email1 = new Email.EmailBuilder("alice@example.com", "Meeting Tomorrow")
	                .body("Let's meet at 10am in conference room B.")
	                .build();

	        Email email2 = new Email.EmailBuilder("bob@example.com", "Project Update")
	                .cc("carol@example.com")
	                .cc("dave@example.com")
	                .bcc("manager@example.com")
	                .body("Attached is the Q4 report.")
	                .priority("high")
	                .attachment("q4-report.pdf")
	                .attachment("summary.xlsx")
	                .build();

	        System.out.println(email1);
	}
}
