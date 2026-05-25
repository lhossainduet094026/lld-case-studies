package dry.configLoader;

import java.util.HashMap;
import java.util.Map;

public class ConfigLoaderApp {

	public static void main(String[] args) {

		Map<String, String> fileConfig = new HashMap<>();
		fileConfig.put("db.host", "localhost");
		fileConfig.put("db.port", "5432");

		Map<String, String> defaults = new HashMap<>();
		defaults.put("db.host", "127.0.0.1");
		defaults.put("db.port", "3306");
		defaults.put("db.timeout", "30");

		ConfigLoader loader = new ConfigLoader(new FileConfigSource(fileConfig), new EnvConfigSource(),
				new DefaultConfigSource(defaults));

		System.out.println("db.host = " + loader.get("db.host"));
		System.out.println("db.port = " + loader.get("db.port"));
		System.out.println("db.timeout = " + loader.get("db.timeout"));
	}

}
