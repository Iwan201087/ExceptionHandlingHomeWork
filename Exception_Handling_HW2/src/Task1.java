// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. Если число отрицательное 
//или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
//В противном случае, программа должна выводить сообщение "Число корректно".
import java.util.Scanner;

import Exeptions.InvalidNumberException;

public class Task1 {
    public static void negativeNumber(int number) {
        if (number < 0 || number == 0) {
            throw new InvalidNumberException("Введенное Вами число некорректное");
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите положительное число: ");
        try (Scanner scan = new Scanner(System.in)) {
            int number = Integer.parseInt(scan.nextLine());
        try {
            negativeNumber(number);
            System.out.println("Число " + number + " введено верно");
            } catch (InvalidNumberException e) {
            System.out.println("Введенное Вами число некорректно");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}