import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double val1;
        double val2;
        char operand;
        char calculaterOperator = 'c';
        double result = 0;

        do {
            if (calculaterOperator == 'c') {
                System.out.print("Введите первый операнд: ");
                val1 = scanner.nextDouble();
                System.out.print("Введите оператор: ");
                operand = scanner.next().charAt(0);
            } else {
                val1 = result;
                operand = calculaterOperator;

            }

            System.out.print("Введите второй операнд: ");
            val2 = scanner.nextDouble();

            result = calculate(val1, val2, operand);
            System.out.println(val1 + " " + operand + " " + val2 + " = " + result);
            calculaterOperator = scanner.next().charAt(0);

        } while (calculaterOperator != 's');


    }

    public static double calculate(double val1, double val2, char operand) {
        return switch (operand) {
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;
            default -> {
                System.out.println("Wrong operand");
                yield 0;
            }
        };
    }
}
