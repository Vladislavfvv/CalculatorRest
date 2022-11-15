package com.example.calculatorrest.controller;


import com.example.calculatorrest.entity.Operation;
import com.example.calculatorrest.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @Autowired
    CalcService calcService;
    private final AtomicLong atomicLong = new AtomicLong();

    @PostMapping("/operation")
    public Operation calc(@RequestBody Operation operation) {
        //operation.setResult(operation.getNum1() + operation.getNum2());
        operation = calcService.calculate(operation);
        return operation;
    }

    @GetMapping("/findAll")
    public List<Operation> findAll() {
        return calcService.findAll();
    }


}
