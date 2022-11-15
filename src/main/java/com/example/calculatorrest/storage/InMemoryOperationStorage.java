package com.example.calculatorrest.storage;

import com.example.calculatorrest.entity.Operation;
import com.example.calculatorrest.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Component("inMemoryOperationStorage")
public class InMemoryOperationStorage extends Storage<Operation, Long> {
    List<Operation> operationList = new ArrayList<>();
    private final AtomicLong atomicLong = new AtomicLong();



    @Override
    public Operation save(Operation operation) {
        operation.setId(atomicLong.incrementAndGet());
        operation.setDate(LocalDateTime.now());
        operationList.add(operation);
        return operation;
    }

    @Override
    public List<Operation> getOperationList() {
        return operationList;
    }

    @Override
    public Optional<Operation> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Operation> findEntity(String parameter) {
        return Optional.empty();
    }
}
