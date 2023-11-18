package exception;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException exception) {
            System.out.println("Деление на 0");
        }
        try {
            accessToUnexistingElement();
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Массив меньше");
        }
        try {
            playWithNullPointer();
        } catch (NullPointerException exception) {
            System.out.println("NullPointer");
        }
        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException exception) {
            System.out.println("Нельзя создать такой массив");
        }
        try {
            searchSomethingOutString();
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Строка меньше");
        }
        System.out.println("Ура! Меня снова печают");
    }


    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement(){
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length+1; i++) {
            System.out.printf("%d,", i);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData);
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }

}
