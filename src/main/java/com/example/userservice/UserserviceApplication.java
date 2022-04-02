package com.example.userservice;

import com.example.userservice.models.Role;
import com.example.userservice.models.User;
import com.example.userservice.services.UserService;
import com.example.userservice.services.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS");
            }
        };
    }
    /*@Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveRole(new Role(null, "ROLLE_USER"));
            userService.saveRole(new Role(null, "ROLLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "toufik" , "toufiklmh","123",new ArrayList<Role>()));
            userService.saveUser(new User(null, "toufik1" , "toufiklm2","1234",new ArrayList<Role>()));
            userService.saveUser(new User(null, "toufik2" , "toufiklmh3","1235",new ArrayList<Role>()));
            userService.saveUser(new User(null, "toufik3" , "toufiklmh4","1236",new ArrayList<Role>()));
            userService.saveUser(new User(null, "toufik4" , "toufiklmh5","1237",new ArrayList<Role>()));

            userService.addRoleToUser("toufiklmh","ROLLE_USER");
            userService.addRoleToUser("toufiklmh","ROLLE_MANAGER");
            userService.addRoleToUser("toufiklmh","ROLLE_ADMIN");
            userService.addRoleToUser("toufiklmh","ROLLE_SUPER_ADMIN");
            userService.addRoleToUser("toufiklmh3","ROLLE_SUPER_ADMIN");
            userService.addRoleToUser("toufiklmh5","ROLLE_ADMIN");
            userService.addRoleToUser("toufiklmh4","ROLLE_USER");
        };
    }*/

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
