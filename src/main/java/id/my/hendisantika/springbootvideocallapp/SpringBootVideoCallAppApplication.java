package id.my.hendisantika.springbootvideocallapp;

import id.my.hendisantika.springbootvideocallapp.user.User;
import id.my.hendisantika.springbootvideocallapp.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootVideoCallAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVideoCallAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            UserService service
    ) {
        return args -> {
            service.register(User.builder()
                    .username("yuji")
                    .email("yuji@yopmail.com")
                    .password("Naruto2024!")
                    .build());

            service.register(User.builder()
                    .username("megumi")
                    .email("jomegumi@yopmail.com")
                    .password("Naruto2024!")
                    .build());

            service.register(User.builder()
                    .username("gojo")
                    .email("gojo@yopmail.com")
                    .password("Naruto2024!")
                    .build());
        };
    }
}
