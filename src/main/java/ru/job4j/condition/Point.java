package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double three = Math.pow(first, 2);
        double four = Math.pow(second, 2);
        double five = three + four;
        return Math.sqrt(five);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(7, 1, 2, -1);
        System.out.println("result (7, 1) to (2, -1) " + result1);
        double result2 = Point.distance(2, -4, -5, 3);
        System.out.println("result (2, -4) to (-5, 3) " + result2);
    }
}
