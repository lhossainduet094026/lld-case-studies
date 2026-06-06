package srp.ReportManager;

import java.util.List;

public class ReportManagerApp {

	public static void main(String[] args) {

		ReportGenerator generator = new ReportGenerator();
		ReportFormatter formatter = new ReportFormatter();
		ReportDistributor distributor = new ReportDistributor();

		List<String[]> reportData = generator.generateReportData();
		String formattedCsvData = formatter.formatAsCsv(reportData);
		distributor.distribute("manager@company.com", formattedCsvData);
	}

}
