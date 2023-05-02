import java.util.Scanner;

public class ex4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean falg = false;
        String inputData;
        while (!falg) {
            System.out.print("Введите НЕ пустую строку: ");
            try {
                inputData = scanner.nextLine();
                if (inputData.length() > 0) {
                    System.out.println("Ваша строка: " + inputData);
                    falg = true;
                } else {
                    System.out.println("Строка пустая");
                    falg = false;
                }
            } catch (Exception ex) {
                System.out.println("Неа");
                falg = false;
            }
        }
    }
}
