public class GenericMethodApp {
    public static void main(String[] args) {
        Validator<Integer> isEven = e -> e % 2 == 0;
        Validator<String> isNotNullOrEmpty = e -> e != null || !e.isEmpty();

        System.out.println(ValidateHelper.validate(11, isEven));
        System.out.println(ValidateHelper.validate("l", isNotNullOrEmpty));
    }
}
