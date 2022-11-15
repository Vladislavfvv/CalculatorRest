package com.example.calculatorrest.service;

import com.example.calculatorrest.entity.Operation;
import com.example.calculatorrest.entity.User;
import com.example.calculatorrest.storage.InMemoryOperationStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalcService {
    @Autowired
    private InMemoryOperationStorage inMemoryOperationStorage;

    private double findSum(double num1, double num2) {
        return num1 + num2;
    }

    private double findDiff(double num1, double num2) {
        return num1 - num2;
    }

    private double findMulti(double num1, double num2) {
        return num1 * num2;
    }

    private double findDiv(double num1, double num2) {
        return num1 / num2;
    }

    public Operation calculate(Operation operation) {
        double num1 = operation.getNum1();
        double num2 = operation.getNum2();
        switch (operation.getOperation()) {
            case ("sum"):
                operation.setResult(findSum(num1, num2));
                break;
            case ("diff"):
                operation.setResult(findDiff(num1, num2));
                break;
            case ("mul"):
                operation.setResult(findMulti(num1, num2));
                break;
            case ("div"):
                operation.setResult(findDiv(num1, num2));
                break;
            default:
                break;
        }

        inMemoryOperationStorage.save(operation);
        return operation;
    }

    public List<Operation> findAll(){
        return inMemoryOperationStorage.getOperationList();
    }
}
