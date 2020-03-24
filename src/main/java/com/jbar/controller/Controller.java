package com.jbar.controller;

import com.jbar.database.UserRepository;
import com.jbar.database.models.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Struct;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Controller {

    @NonNull UserRepository userRepository;


    @GetMapping("/")
    public String defaultMap() {
        return "Hello";
    }

    @GetMapping("/admin")
    public String adminMap() {
        return "Hello Admin!";
    }

    @GetMapping("/user")
    public String userMap() {
        return "Hello User!";
    }

    @GetMapping("/error")
    public String errorMap() {
        return ("<h1>Hmmm</h1>");
    }

    protected User createUser() {
        return new User("user", "pass", true, "USER");
    }

    protected User createAdmin() {
        return new User("admin", "pass", true, "ADMIN");
    }

}
