public class ValidateHelper {
    public static <T> boolean validate(T value, Validator<T> validator){
        return validator.validate(value);
    }
}
