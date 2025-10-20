package com.devmaster.lesson01.method_ref;

import java.util.Arrays;

public class DemoMethodRef {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // --- Tham chiếu đến static method ---
        int sum = doAction(a, b, MathUtils::sum);
        System.out.println(a + " + " + b + " = " + sum);

        int minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus);

        // --- Tham chiếu đến instance method ---
        MathUtils mathUtils = new MathUtils();
        int multiply = doAction(a, b, mathUtils::multiply);
        System.out.println(a + " * " + b + " = " + multiply);

        // --- Tham chiếu đến instance method của 1 đối tượng cụ thể ---
        String[] stringArray = {"Java", "C++", "PHP", "C#", "Javascript"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);

        System.out.println("Danh sách sau khi sắp xếp:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }

    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}

