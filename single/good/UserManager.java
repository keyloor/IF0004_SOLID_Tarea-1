public class UserManager {

    public void registerUser(User user) {
        if (Validator.validatePassword(user.getPassword()) && Validator.validateUsername(user.getUsername())) {
            IOManager.printMessage("User registered successfully.");
        } else {
            IOManager.printMessage("Invalid username or password.");
        }
    }

    public void loginUser(User user) {
        if (Validator.validatePassword(user.getPassword()) && Validator.validateUsername(user.getUsername())) {
            IOManager.printMessage("User logged in successfully.");
        } else {
            IOManager.printMessage("Invalid username or password.");
        }
    }
}
