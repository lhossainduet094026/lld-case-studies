package dry.configLoader;

import java.util.Map;

public class DefaultConfigSource implements ConfigSource {

	private final Map<String, String> config;

	public DefaultConfigSource(Map<String, String> config) {

		this.config = config;
	}

	@Override
	public String loadValue(String key) {
		return config.get(key);
	}

}
