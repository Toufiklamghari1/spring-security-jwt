package com.example.userservice;

import lombok.Data;

@Data
public class RequestLogin {
    private String username;
    private String password;
}
