package dry.configLoader;

public interface ConfigSource {

	String loadValue(String key);
}
