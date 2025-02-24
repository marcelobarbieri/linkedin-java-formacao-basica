public class App {
    public static void main(String[] args)  {
        User user1 = new User(
            "user1",
            "password1",
            "email1"
        );
        User user2 = new User(
            "user2",
            "password2",
            "email2"
        );
        user1.active = true;
        System.out.println(user1.isActive());
        System.out.println(user2.isActive());
        System.out.println(User.getLimitCarac());

        System.out.println(User.limitCarac);
    }
}
