package kiss.SimplifyAStringFormatter;

public class DisplayNameFormatterApp {

	public static void main(String[] args) {

		DisplayNameFormatter formatter = new DisplayNameFormatter();
		System.out.println(formatter.formatDisplayName("  john doe  "));
		System.out.println(formatter.formatDisplayName("ALICE"));
		System.out.println(formatter.formatDisplayName("  bob  "));
	}

}
