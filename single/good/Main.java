public class Main {
    public static void main(String[] args) {

        User user = new User("Pepe_1", "Pepe.1230");
        UserManager manager = new UserManager();
        manager.registerUser(user);
        manager.loginUser(user);

    }

}
