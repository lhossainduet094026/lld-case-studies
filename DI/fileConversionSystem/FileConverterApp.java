package fileConversionSystem;

public class FileConverterApp {

	public static void main(String[] args) {
		FileConverter converter = new FileConverter();

		FileReader reader = new FileReader();
		FormatParser parser = new FormatParser();
		FileWriter writer = new FileWriter();

		converter.convert("data.csv", "output.json", "JSON", reader, parser, writer);
	}
}
