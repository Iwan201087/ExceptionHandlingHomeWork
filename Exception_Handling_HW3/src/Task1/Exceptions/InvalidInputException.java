package Task1.Exceptions;

/**
 * InvalidInputException - исключение возникающее при  выполнении операции 
 * с неверным вводом исходных данных (отрицательное значение степени, или нулевой показатель степени)
 */
public class InvalidInputException extends Exception {

    /**
     * Метод создает новый экземпляр исключения InvalidInputException с выводом дополнительного сообщения об ошибке
     * @param message сообщение об ошибке.
     */
    public InvalidInputException(String message) {
        super(message);
    }

    /**
     * Метод создает новый экземпляр исключения InvalidInputException без вывода дополнительного сообщения об ошибке
     */
    public InvalidInputException() {
        super();
    }
}