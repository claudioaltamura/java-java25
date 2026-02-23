package de.claudioaltamura.java25.markdowndocumentation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharReplacerTest {

    @Test
    void replaceAll() {
        CharReplacer charReplacer = new CharReplacer();
        String result = charReplacer.replace("Hello World!");
        assertEquals("H3ll0 W0rld!", result);
    }


    @Test
    void replace() {
        CharReplacer charReplacer = new CharReplacer();
        String result = charReplacer.replace("Hello World!", "o", "0");
        assertEquals("Hellx Wxrld!", result);
    }

}