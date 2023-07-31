import java.util.Scanner;
import Exeptions.DivisionByZeroException;

public class Task2 {
    public int divisionNum1Num2( int num1, int num2) {
        if (num2 == 0)
            throw new DivisionByZeroException("Деление на ноль недопустимо. Введите корректные данные");
        return num1 / num2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Task2 resultDivision = new Task2();
        System.out.println("Введите первое число: ");
        int num1 = input.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = input.nextInt();
        try {
            System.out.println("Результат деления: "+resultDivision.divisionNum1Num2(num1, num2)); 
        } catch (Exception e) {
            System.out.println("Ошибка деления : " + e.getMessage());
        }
    }
}