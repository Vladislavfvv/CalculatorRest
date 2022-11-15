package com.example.calculatorrest.dto;

import com.example.calculatorrest.entity.Operation;
import com.example.calculatorrest.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    //    @NotBlank(message = "Field must not be empty")
//    private String email;
//    @NotBlank(message = "Field must not be empty")
//    private String password;
    Map<User, List<Operation>> userListMap = new HashMap<>();

    public Map<User, List<Operation>> getUserListMap() {
        return userListMap;
    }
}
