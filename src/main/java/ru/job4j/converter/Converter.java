package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 210;
        float expectedEuro = 3;
        float expectedDollar = 3.5F;
        float out;
        out = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == out;
        System.out.println("210 rubles are 3 euro. Test result : " + passedEuro);
        out = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == out;
        System.out.println("210 rubles are 3.5 dollars. Test result : " + passedDollar);
    }
}
