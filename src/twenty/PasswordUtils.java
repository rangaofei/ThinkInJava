package twenty;

import java.util.List;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
public class PasswordUtils {
    @UseCase(id = 47, description = "Password must contain least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id=48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id=49,description = "New Passwrods can't equal previously used ones")
    public boolean checkForNewPassword(List<String> precPasswords,String password){
        return !precPasswords.contains(password);
    }
}
