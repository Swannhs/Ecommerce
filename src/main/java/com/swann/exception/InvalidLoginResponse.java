package com.swann.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InvalidLoginResponse {
    private String username;
    public String password;

    public InvalidLoginResponse(String username, String password) {
        this.username = "Invalid Username";
        this.password = "Invalid password";
    }
}
