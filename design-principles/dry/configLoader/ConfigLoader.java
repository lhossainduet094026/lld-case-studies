package dry.configLoader;

import java.util.List;

public class ConfigLoader {

	private final List<ConfigSource> configSources;

	public ConfigLoader(ConfigSource... configSources) {

		this.configSources = List.of(configSources);
	}

	public String get(String key) {
		for (ConfigSource source : configSources) {
			String value = source.loadValue(key);
			if (value != null && !value.isEmpty()) {
				return value;
			}
		}
		return null;
	}
}
