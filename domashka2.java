import java.util.Scanner;

public class dp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();

        double result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка!");
                } else {
                    result = num1 / num2;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Некорректный оператор");
        }
    }
}
