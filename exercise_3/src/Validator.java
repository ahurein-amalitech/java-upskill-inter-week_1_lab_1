@FunctionalInterface
public interface Validator<T> {
    boolean validate(T value);
}
