

public class Main {
    public static void main(String[] args) {
      String firstName;
     final int NUM = 67;
     String word = "James";
    firstName = NUM + word;
        System.out.println("Значение переменной fistName:" + firstName);
        System.out.println("Значение переменной NUM" + NUM);
        System.out.println("Значение переменной word:" + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
            System.out.print("Введите ваше имя: ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Привет, " + userName + "!");
    }
}
