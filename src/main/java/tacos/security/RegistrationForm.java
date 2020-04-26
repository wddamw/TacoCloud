package tacos.security;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import tacos.User;

/**
 * @program: TacoCloud
 * @description: 用户注册提交表单对象
 * @author: wjk
 * @create: 2020-04-25 15:55
 */
@Data
public class RegistrationForm {
    private String username;
    private String password;
    private String fullName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
                username, passwordEncoder.encode(password), fullName, street, city, state, zip, phone
        );
    }
}