package Task1;
import java.util.Scanner;
import Task1.Exceptions.InvalidInputException;

/**
 * Класс App представляет простой калькулятор, который выполняет простые
 * арифметические операции
 * (+, -, *, /, возведение в степень) над двумя введенными числами).
 */
public class App {

    /**
     * Главный метод calc класса App запрашивает у пользователя ввод двух чисел
     * и выполняет простые операции(+, -, '', /, возведения первого числа в
     * степень второго числа).
     */
    private static void calc() {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0;

        try {
            System.out.print("Введите первое число: "); // ввод первого числа и преобразование его в тип Double
            num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Введите второе число: "); // ввод второго числа и преобразование его в тип Double
            num2 = Double.parseDouble(scanner.nextLine());

            double sum = num1 + num2; // операция сложения
            System.out.println("Сумма введенных чисел: " + sum);

            double difference = num1 - num2; // операция вычитания
            System.out.println("Разность введенных чисел: " + difference);

            double product = num1 * num2; // операция умножения
            System.out.println("Произведение введенных чисел: " + product);

            if (num2 != 0) { // делитель строго не должен быть равен нулю
                double quotient = num1 / num2;  // операция деления
                System.out.println("Частное введенных чисел: " + quotient);
            } else {
                System.out.println("Ошибка деления : деление на 0 недопустимо");
            }

            try {
                double power = PowerCalculator.calculatePower(num1, num2); // операция возведения в степень
                System.out.println("Результат возведения в степень: " + power);
            } catch (InvalidInputException e) {
                System.out.println("Ошибка возведения в степень: " + e.getMessage());
            }
        } catch (NumberFormatException h) {
            System.out.println("Ошибка ввода: введено не число");
        }
    }

    /**
     * Метод main будет запускает простой калькулятор в цикле, для возможности
     * повторить ввод, если был  некорректный ввод.
     */
    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            calc();
            System.out.print("Выйти из программы? (Y/N): ");
            String choice = new Scanner(System.in).nextLine().toUpperCase();
            if (choice.equals("Y")) {
                isRunning = false;
            }
        }
    }
}