package de.claudioaltamura;

public class ConfigService {

    // Create a StableValue container for caching configuration
    private final StableValue<AppConfig> config = StableValue.of();

    public AppConfig getConfig() {
        // Initialize lazily on first access
        return config.orElseSet(this::loadConfig);
    }

    private AppConfig loadConfig() {
        System.out.println("Loading configuration from file...");
        // Simulate reading configuration data
        return new AppConfig("prod", 20, true);
    }

    public void printConfig() {
        AppConfig cfg = getConfig();
        System.out.printf("Mode: %s | Workers: %d | Cache: %s%n",
                cfg.mode(), cfg.workerCount(), cfg.cacheEnabled());
    }
}