package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || (Character.isUpperCase(name.charAt(0))) || (Character.isDigit(name.charAt(0)))) {
            valid = false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if ((!JavaNameValidator.isSpecialSymbol(code))
                && (!JavaNameValidator.isUpperLatinLetter(code))
                && (!Character.isDigit(code))
                && (!JavaNameValidator.isLowerLatinLetter(code))) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (code >= 65 && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (code >= 97 && code <= 122);
    }
}
