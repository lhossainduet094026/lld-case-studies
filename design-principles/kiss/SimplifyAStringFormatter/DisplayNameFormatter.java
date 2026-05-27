package kiss.SimplifyAStringFormatter;

public class DisplayNameFormatter {

	public String formatDisplayName(String name) {
		
		if(name == null)
			throw new RuntimeException("Invalid input");
		
		name = name.trim();
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}
}
