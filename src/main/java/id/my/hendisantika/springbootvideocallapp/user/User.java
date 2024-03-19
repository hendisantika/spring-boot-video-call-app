package id.my.hendisantika.springbootvideocallapp.user;

import lombok.Builder;
import lombok.Data;

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
@Data
@Builder
public class User {
    private String username;
    private String email;
    private String password;
    private String status;
}
