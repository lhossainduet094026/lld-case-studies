package isp.refactorFatMultiFunctionDevice;

public class OfficePrinter implements Printable, Scanable, Faxable {

	@Override
	public void fax(String document, String number) {
		System.out.println("OfficePrinter -> Faxing: " + document + " to " + number);
	}

	@Override
	public void scan(String document) {
		 System.out.println("OfficePrinter -> Scanning: " + document);
	}

	@Override
	public void print(String document) {
		 System.out.println("OfficePrinter -> Printing: " + document);
	}
}
