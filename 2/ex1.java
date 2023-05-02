import java.util.Scanner;

class ex1 {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Float.parseFloat(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            String num = scanner.next();
            if (isNumeric(num)) {
                System.out.println(num);
                break;
            } else {
                System.out.println("Это не чсило типа Float");
            }
        }
    }
}