Exercise 2: ConfigLoader

Refactor ConfigLoader

Problem: Your application loads configuration from three sources: a config file, environment variables, and default values.
 Each source currently has its own parsing and validation pipeline, but the pipeline logic (read, parse, validate, return) is identical.
 Your task is to eliminate this duplication.
 
 Requirements:

Create a ConfigSource interface with a loadValue(key) method
Implement FileConfigSource, EnvConfigSource, and DefaultConfigSource
Create a ConfigLoader that tries each source in priority order (file first, then env, then defaults) and returns the first non-null value
Add validation: config values must be non-empty strings

import java.util.Map;
import java.util.HashMap;

// Before: Each source has its own load-parse-validate pipeline
class AppConfig {
    private Map<String, String> fileConfig = new HashMap<>();
    private Map<String, String> defaults = new HashMap<>();

    public AppConfig() {
        fileConfig.put("db.host", "localhost");
        fileConfig.put("db.port", "5432");
        defaults.put("db.host", "127.0.0.1");
        defaults.put("db.port", "3306");
        defaults.put("db.timeout", "30");
    }

    public String getFromFile(String key) {
        String value = fileConfig.get(key);
        if (value == null || value.isEmpty()) return null; // Duplicated validation
        return value;
    }

    public String getFromEnv(String key) {
        String value = System.getenv(key.replace(".", "_").toUpperCase());
        if (value == null || value.isEmpty()) return null; // Duplicated validation
        return value;
    }

    public String getFromDefaults(String key) {
        String value = defaults.get(key);
        if (value == null || value.isEmpty()) return null; // Duplicated validation
        return value;
    }
}

// TODO: Extract a ConfigSource interface.
// TODO: Create a ConfigLoader that tries sources in priority order.

public class Main {
    public static void main(String[] args) {
        // After refactoring, usage should look like:
        // ConfigLoader loader = new ConfigLoader(
        //     new FileConfigSource(fileConfig),
        //     new EnvConfigSource(),
        //     new DefaultConfigSource(defaults)
        // );
        // String host = loader.get("db.host");
        // System.out.println("db.host = " + host);
    }
}
 
 