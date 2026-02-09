package de.claudioaltamura.java25.moduleimport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuleImportDeclarationExampleTest {

    private final ModuleImportDeclarationExample example = new ModuleImportDeclarationExample();

    @Test
    void whenExecuteThanGet10Elements() {
        var result = example.execute(10);
        assertEquals(10, result.size());
    }
}