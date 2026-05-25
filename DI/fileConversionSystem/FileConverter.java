package fileConversionSystem;

public class FileConverter {

	public void convert(String sourcePath, String targetPath, String targetFormat, FileReader reader,
			FormatParser parser, FileWriter writer) {

		String content = reader.read(sourcePath);
		parser.parse(content, targetFormat);
		writer.write(targetPath, content);
	}
}
