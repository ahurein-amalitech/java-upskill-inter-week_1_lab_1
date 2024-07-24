public class InnerClassApp {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(18);
        user.setName("Ahurein");

        User.UserInfoHelper userInfoHelper = new User.UserInfoHelper(user);

        System.out.println(userInfoHelper.isTheUserAllowedToProceed());
    }
}
