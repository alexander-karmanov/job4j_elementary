package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean valid = false;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (((Character.isUpperCase(name.charAt(0)) != true)) && (Character.isDigit(name.charAt(0)) != true)) {
                if ((JavaNameValidator.isSpecialSymbol(code))
                   || (JavaNameValidator.isUpperLatinLetter(code))
                   || (JavaNameValidator.isLowerLatinLetter(code))) {
                   valid = true;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 && code <= 122) {
            return true;
        }
        return false;
    }
}
