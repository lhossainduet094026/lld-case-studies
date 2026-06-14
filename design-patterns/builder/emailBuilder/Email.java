package builder.emailBuilder;

import java.util.ArrayList;
import java.util.List;

public class Email {

	private String to; // required (pass in Builder constructor)

	private String subject;// required (pass in Builder constructor)

	private List<String> cc;// optional, can be called multiple times to add multiple CC recipients

	private List<String> bcc;// optional, can be called multiple times

//	body(String) - 
	private String body;// optional

	private String priority = "normal";// optional, defaults to "normal"

	private List<String> attachment;// optional, can be called multiple times

	private Email(EmailBuilder emailBuilder) {

		this.to = emailBuilder.to;
		this.subject = emailBuilder.subject;
		this.cc = emailBuilder.cc;
		this.bcc = emailBuilder.bcc;
		this.body = emailBuilder.body;
		this.priority = emailBuilder.priority;
		this.attachment = attachment;
	}

	@Override
	public String toString() {
		return "Email{to='" + to + "', subject='" + subject + "', cc=" + cc + ", bcc=" + bcc + ", body='" + body
				+ "', priority='" + priority + "', attachments=" + attachment + "}";
	}

	public static class EmailBuilder {

		private String to;
		private String subject;
		private List<String> cc;
		private List<String> bcc;
		private String body;
		private String priority = "normal";
		private List<String> attachment;

		public EmailBuilder(String to, String subject) {
			this.to = to;
			this.subject = subject;
			this.cc = new ArrayList<>();
			this.bcc = new ArrayList<>();
			this.attachment = new ArrayList<>();
		}

		public EmailBuilder cc(String cc) {
			this.cc.add(cc);
			return this;
		}

		public EmailBuilder bcc(String bcc) {
			this.bcc.add(bcc);
			return this;
		}

		public EmailBuilder body(String body) {
			this.body = body;
			return this;
		}

		public EmailBuilder priority(String priority) {
			this.priority = priority;
			return this;
		}

		public EmailBuilder attachment(String attachment) {
			this.attachment.add(attachment);
			return this;
		}

		public Email build() {
			return new Email(this);
		}
	}
}
