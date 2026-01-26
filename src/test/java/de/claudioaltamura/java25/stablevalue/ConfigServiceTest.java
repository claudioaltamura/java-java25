package de.claudioaltamura.java25.stablevalue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigServiceTest {

    @Test
    void getConfig() {
        AppConfig appConfig = new AppConfig("production", 8, true);
        ConfigService configService = new ConfigService(appConfig);

        AppConfig config = configService.getConfig();
        assertEquals("production", config.mode());
        assertEquals(8, config.workerCount());
        assertTrue(config.cacheEnabled());
    }
}