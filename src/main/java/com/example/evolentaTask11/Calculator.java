package com.example.evolentaTask11;


import com.example.evolentaTask11.operation.Operation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    Operation adder;
    Operation substractor;
    Operation multiply;
    Operation division;

    public Calculator(@Qualifier("adder") Operation adder, @Qualifier("subtractor") Operation substractor, @Qualifier("multiply") Operation multiply, @Qualifier("division") Operation division) {
        this.adder = adder;
        this.substractor = substractor;
        this.multiply = multiply;
        this.division = division;
    }


    public void calc(double a, double b) {
        System.out.println("Сложение: " + adder.getResult(a, b));
        System.out.println("Вычитание: " + substractor.getResult(a, b));
        System.out.println("Умножение: " + multiply.getResult(a, b));
        System.out.println("Деление: " + division.getResult(a, b));
    }
}
