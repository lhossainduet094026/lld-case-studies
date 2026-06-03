Exercise 1: Simplify an Overengineered PasswordValidator.

Simplify an Overengineered PasswordValidator
Problem: A developer built a full validation rules engine with an interface, three rule classes,
 and a validation engine. But the actual requirement is simple: check if a password is at least 8 characters long.

Here is the overengineered code:

interface ValidationRule {
    boolean check(String input);
}

class MinLengthRule implements ValidationRule {
    private final int minLength;
    MinLengthRule(int minLength) { this.minLength = minLength; }
    public boolean check(String input) { return input.length() >= minLength; }
}

class HasUpperCaseRule implements ValidationRule {
    public boolean check(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }
}

class HasDigitRule implements ValidationRule {
    public boolean check(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}

class PasswordValidator {
    private final List<ValidationRule> rules;

    PasswordValidator(List<ValidationRule> rules) { this.rules = rules; }

    public boolean isValid(String password) {
        for (ValidationRule rule : rules) {
            if (!rule.check(password)) return false;
        }
        return true;
    }
}