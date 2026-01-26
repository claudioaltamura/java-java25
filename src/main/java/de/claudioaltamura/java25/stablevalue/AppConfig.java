package de.claudioaltamura.java25.stablevalue;

public record AppConfig(String mode, int workerCount, boolean cacheEnabled) {}
