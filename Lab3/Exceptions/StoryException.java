package Lab3.Exceptions;

public class StoryException extends Error {
    public StoryException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println(" └──   "+getMessage()); // Выводим сообщение об ошибке
    }
}
