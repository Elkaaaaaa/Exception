import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static Integer inputInt(String text) {
        System.out.println(text);
        while (true) {
            String check = scanner.next();
            if (isNumeric(check)) {
                return Integer.parseInt(check);
            } else {
                System.out.println("Это не число, попробуйте еще раз");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        int count = inputInt("Введите длину первого массива: ");
        int counter = 0;
        do {
            array1.add(inputInt("Введите элемент массива"));
            counter += 1;
        } while (counter < count);
        ArrayList<Integer> array2 = new ArrayList<>();

        count = inputInt("Введите длину второго массива: ");
        counter = 0;
        do {
            array2.add(inputInt("Введите элемент массива"));
            counter += 1;
        } while (counter < count);
        System.out.println(differenceArray(array1, array2));
    }

    public static ArrayList<Integer> differenceArray(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = Math.min(array1.size(), array2.size());
        int max = Math.max(array1.size(), array2.size());
        if (min < 1) {
            throw new RuntimeException("Один из массивов пуст");
        }
        if (min < max) {
            throw new RuntimeException("Длинны массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            result.add(array1.get(i) - array2.get(i));
        }
        return result;
    }
}
