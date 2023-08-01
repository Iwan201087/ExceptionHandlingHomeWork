package Task1;
import Task1.Exceptions.InvalidInputException;

/**
 * PowerCalculator - класс который будет  возводить число в степень.
 */
public class PowerCalculator {

    /**
     * класс PowerCalculator производит возведение в степень первого введенного числа
     * с показателем, равным второму введенному числу
     * Если введено некорректное основание (нулевое значение основания или отрицательное значение показателя степени),
     * пробрасывается исключение InvalidInputException.
     *
     * @param base     - основание, которое нужно возвести в степень
     * @param exponent - показатель степени, в которую нужно возвести base
     * @return power - результат возведения в степень
     * @throws InvalidInputException исключение, возникающее при некорректном вводе.
     */
    public static double calculatePower (double base, double exponent)
            throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Ошибка ввода данных: основание равно 0 или показатель степени отрицательный");
        }
        double power = Math.pow(base, exponent);
        return power;
    }
}