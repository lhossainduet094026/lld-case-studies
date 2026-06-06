Refactor ReportManager Class

Problem: You have a ReportManager class that generates report data, formats it into a specific output (CSV, JSON),
 and distributes it via email. These are three distinct responsibilities bundled into one class. Your task is to refactor 
 it into ReportGenerator, ReportFormatter, and ReportDistributor.

Requirements:

ReportGenerator should gather and return raw report data (a list of records)
ReportFormatter should take raw data and format it as CSV text
ReportDistributor should take a formatted report and "send" it to a recipient
The main workflow should compose these three classes together.

import java.util.*;

// Before: One class doing three unrelated jobs
class ReportManager {
    public void createAndSendReport(String recipient) {
        // Responsibility 1: Generate report data
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Name", "Sales", "Region"});
        data.add(new String[]{"Alice", "15000", "North"});
        data.add(new String[]{"Bob", "22000", "South"});
        data.add(new String[]{"Charlie", "18000", "East"});

        // Responsibility 2: Format as CSV
        StringBuilder csv = new StringBuilder();
        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }

        // Responsibility 3: Distribute via email
        System.out.println("Sending report to: " + recipient);
        System.out.println(csv.toString());
        System.out.println("Report sent successfully.");
    }
}

// TODO: Refactor into ReportGenerator, ReportFormatter, and ReportDistributor.

public class Main {
    public static void main(String[] args) {
        // After refactoring, usage should look like:
        // ReportGenerator generator = new ReportGenerator();
        // ReportFormatter formatter = new ReportFormatter();
        // ReportDistributor distributor = new ReportDistributor();
        // List<String[]> data = generator.generate();
        // String formatted = formatter.formatAsCsv(data);
        // distributor.distribute("manager@company.com", formatted);
    }
}