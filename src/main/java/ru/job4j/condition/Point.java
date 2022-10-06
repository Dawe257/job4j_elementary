package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(12, 23, 58, 15);
        System.out.println("result (12, 23) to (58, 15) " + result);

        result = Point.distance(6, 2, 18, 1);
        System.out.println("result (6, 2) to (18, 1) " + result);
    }
}