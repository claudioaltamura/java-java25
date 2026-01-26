package de.claudioaltamura.java25.stablevalue;

public class ConfigService {

    // Create a StableValue container for caching configuration
    private final StableValue<AppConfig> config = StableValue.of();

    public ConfigService(AppConfig appConfig) {
        this.config.setOrThrow(appConfig);
    }

    public AppConfig getConfig() {
        return config.orElseThrow();
    }

    public void printConfig() {
        AppConfig cfg = getConfig();
        System.out.printf("Mode: %s | Workers: %d | Cache: %s%n",
                cfg.mode(), cfg.workerCount(), cfg.cacheEnabled());
    }
}