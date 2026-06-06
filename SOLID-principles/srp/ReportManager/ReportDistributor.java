package srp.ReportManager;

public class ReportDistributor {

	public void distribute(String recipient, String csvData) {
		System.out.println("Sending report to: " + recipient);
		System.out.println(csvData);
		System.out.println("Report sent successfully.");
	}
}
