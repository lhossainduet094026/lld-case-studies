package dry.configLoader;

import java.util.Map;

public class FileConfigSource implements ConfigSource {

	private final Map<String, String> config;

	public FileConfigSource(Map<String, String> config) {

		this.config = config;
	}

	@Override
	public String loadValue(String key) {

		return config.get(key);
	}

}
