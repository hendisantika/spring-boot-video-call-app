package id.my.hendisantika.springbootvideocallapp.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-video-call-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 3/19/24
 * Time: 08:17
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserService {
    private static final List<User> USERS_LIST = new ArrayList<>();

    public void register(User user) {
        user.setStatus("online");
        USERS_LIST.add(user);
    }
}
