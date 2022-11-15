package com.example.calculatorrest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstractEntity{
    //private long id;
//    private String name;
//    private  int age;

//    @NotBlank(message = "Field must not be empty")
//    @Size(message = "First name length must be 2 - 16", min = 2, max = 16)
//    @Pattern(message = "First name must consist of latin letters!", regexp = "[a-zA-Z]*")
    private String firstName;
//    @NotBlank(message = "Field must not be empty")
//    @Size(message = "Second name length must be 2 - 16", min = 2, max = 16)
//    @Pattern(message = "Second name must consist of latin letters!", regexp = "[a-zA-Z]*")
    private String secondName;
//    @NotBlank(message = "Field must not be empty")
//    @Email(message = "Email is incorrect!")
    private String email;
//    @NotBlank(message = "Field must not be empty")
//    @Size(message = "Password length must be 5-10 characters!", min = 5, max = 10)
//    @Pattern(message = "Password must consist of numbers and latin letters!", regexp = "[\\w\\d]+")
    private String password;

}
