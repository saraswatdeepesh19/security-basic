package com.deepesh.springboot3features.dto;

import lombok.Data;

@Data
public class UserRequest {
    private String psid;
    private String userName;
    private String email;
    private String password;
    private String projectName;
    private String gbgf;
    private String role;    // e.g., PROJECT_ADMIN
}