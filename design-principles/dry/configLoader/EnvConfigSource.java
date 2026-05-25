package dry.configLoader;

public class EnvConfigSource implements ConfigSource{

	@Override
	public String loadValue(String key) {
		return System.getenv(key.replace(".", "_").toUpperCase());
	}
}
