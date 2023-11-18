package exception;

import java.util.Random;

public class Third {

    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    try {
                        checkPassword(a, b, c);
                        a = b = c = 10;
                    } catch (WrongPassword e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }

    public static void checkPassword (int a, int b, int c) throws WrongPassword{
        Random random = new Random();
        int[] password = new int[] {random.nextInt(10), random.nextInt(10), random.nextInt(10)};
        if (a == password[0] && b == password[1] && c == password[2]) System.out.println(a + " " + b + " " + c + " - верный пароль");
        else if (a != password[0] && b == password[1] && c == password[2]) throw new WrongPassword(a + " - Ошибка", b + " - Верно", c + " - Верно");
        else if (a == password[0] && b != password[1] && c == password[2]) throw new WrongPassword(a + " - Верно", b + " - Ошибка", c + " - Верно");
        else if (a == password[0] && b == password[1] && c != password[2]) throw new WrongPassword(a + " - Верно", b + " - Верно", c + " - Ошибка");
        else if (a != password[0] && b != password[1] && c == password[2]) throw new WrongPassword(a + " - Ошибка", b + " - Ошибка", c + " - Верно");
        else if (a != password[0] && b == password[1] && c != password[2]) throw new WrongPassword(a + " - Ошибка", b + " - Верно", c + " - Ошибка");
        else if (a == password[0] && b != password[1] && c != password[2]) throw new WrongPassword(a + " - Верно", b + " - Ошибка", c + " - Ошибка");
        else if (a != password[0] && b != password[1] && c != password[2]) throw new WrongPassword(a + " - Ошибка", b + " - Ошибка", c + " - Ошибка");
    }
}
