package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (!name.isEmpty()) {
            if (isLowerLatinLetter(name.charAt(0))) {
                for (int i = 1; i < name.length(); i++) {
                    int code = name.codePointAt(i);
                    if (!isSpecialSymbol(code)
                            && !isUpperLatinLetter(code)
                            && !isLowerLatinLetter(code)
                            && !Character.isDigit(code)) {
                        valid = false;
                        break;
                    }
                    valid = true;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return Character.isUpperCase(code);
    }

    public static boolean isLowerLatinLetter(int code) {
        return Character.isLowerCase(code);
    }
}