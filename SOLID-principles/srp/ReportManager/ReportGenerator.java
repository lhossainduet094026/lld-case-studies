package srp.ReportManager;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {

	public List<String[]> generateReportData() {

		List<String[]> data = new ArrayList<>();

		data.add(new String[] { "Name", "Sales", "Region" });
		data.add(new String[] { "Alice", "15000", "North" });
		data.add(new String[] { "Bob", "22000", "South" });
		data.add(new String[] { "Charlie", "18000", "East" });

		return data;
	}
}
