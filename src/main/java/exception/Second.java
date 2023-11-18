package exception;

import java.util.Arrays;

public class Second {

    public static void main(String[] args) {
        try {
            divide(100,1);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            divide(100,10);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            printSmallString("qwerty");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            printSmallString("qwert");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            printPositiveArray(0, -2);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            printPositiveArray(1, 2);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void divide(int a, int b) {
        if (b == 1) throw new ArithmeticException("Бессмысленно делить на 1");
        else System.out.println(a / b);
    }

    public static void printSmallString(String str) {
        if (str.length() > 5) throw new IndexOutOfBoundsException("В строке должно быть не более 5 символов");
        else System.out.println(str);
    }

    public static void printPositiveArray(int a, int b) {
        if (a > 0 && b > 0) System.out.println(Arrays.toString(new int[]{a, b}));
        else throw new ArithmeticException("Оба числа должны быть положительными");
    }

}
