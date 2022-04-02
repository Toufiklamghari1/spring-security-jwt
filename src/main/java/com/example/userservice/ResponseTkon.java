package com.example.userservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseTkon {
    private String access_token;
    private String refresh_token;
}
