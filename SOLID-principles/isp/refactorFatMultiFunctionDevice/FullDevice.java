package isp.refactorFatMultiFunctionDevice;

public class FullDevice implements Printable, Faxable, Scanable, Stapleable {

	@Override
	public void staple(String document) {
		System.out.println("FullDevice -> Stapling: " + document);

	}

	@Override
	public void scan(String document) {

		System.out.println("FullDevice -> Scanning: " + document);
	}

	@Override
	public void fax(String document, String number) {

		System.out.println("FullDevice -> Faxing: " + document + " to " + number);
	}

	@Override
	public void print(String document) {

		System.out.println("FullDevice -> Printing: " + document);
	}

}
