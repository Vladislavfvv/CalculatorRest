package com.example.calculatorrest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation extends AbstractEntity{
    private double num1;
    private double num2;
    private String operation;
    private double result;
    private User user;
    private LocalDateTime date;
}
