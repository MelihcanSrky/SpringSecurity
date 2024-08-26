package com.sarikaya.security.basic_auth;

import com.sarikaya.security.basic_auth.dto.CreateUserRequest;
import com.sarikaya.security.basic_auth.model.Role;
import com.sarikaya.security.basic_auth.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class BasicAuthApplication implements CommandLineRunner {

    private final UserService userService;

    public BasicAuthApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BasicAuthApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        createDummyData();
    }

    private void createDummyData() {
        CreateUserRequest request = CreateUserRequest.builder()
                .name("Melihcan")
                .username("Melocan")
                .password("pass")
                .authorities(Set.of(Role.ROLE_USER))
                .build();

        userService.createUser(request);

        CreateUserRequest request1 = CreateUserRequest.builder()
                .name("Melocan")
                .username("Mcan")
                .password("pass")
                .authorities(Set.of(Role.ROLE_ADMIN))
                .build();

        userService.createUser(request1);
    }
}