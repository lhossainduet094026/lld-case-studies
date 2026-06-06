package srp.ReportManager;

import java.util.List;

public class ReportFormatter {

	public String formatAsCsv(List<String[]> data) {
		StringBuilder csv = new StringBuilder();
		for (String[] row : data) {
			csv.append(String.join(",", row)).append("\n");
		}

		return csv.toString();
	}
}
