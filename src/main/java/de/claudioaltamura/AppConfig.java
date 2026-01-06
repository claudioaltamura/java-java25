package de.claudioaltamura;

public record AppConfig(String mode, int workerCount, boolean cacheEnabled) {}
