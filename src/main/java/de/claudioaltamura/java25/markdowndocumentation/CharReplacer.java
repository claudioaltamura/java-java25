package de.claudioaltamura.java25.markdowndocumentation;

public class CharReplacer {

    public String replace(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        var ret = replace(input, "e", "3");
        ret = replace(ret, "o", "0");

        return ret;
    }

    /// Replaces all occurrences of the target string with the replacement string in the input string.
    ///
    /// @param input the string to perform the replacement on
    /// @param target the string to be replaced
    /// @param replacement the string to replace the target with
    /// @return a new string with the replacements made
    /// @throws IllegalArgumentException if input is null, target is null or empty, or replacement is null
    String replace(String input, String target, String replacement) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        if (target == null || target.isEmpty()) {
            throw new IllegalArgumentException("Target string cannot be null or empty");
        }
        if (replacement == null) {
            throw new IllegalArgumentException("Replacement string cannot be null");
        }
        return input.replace(target, replacement);
    }
}
