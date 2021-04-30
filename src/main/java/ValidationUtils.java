public class ValidationUtils {
    private static final int MAX_STRING_LENGTH = 5;
    private static final int MIN_STRING_LENGTH = 1;

    private static final int MAX_INPUT_NUMBER = 9;
    private static final int MIN_INPUT_NUMBER = 1;

    public static boolean validCarName(String carName) {
        return carName.length() <= MAX_STRING_LENGTH && carName.length() >= MIN_STRING_LENGTH;
    }

    public static boolean validNo(int no) {
        return no <= MAX_INPUT_NUMBER && no >= MIN_INPUT_NUMBER;
    }
}
