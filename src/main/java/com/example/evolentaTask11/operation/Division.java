
package com.example.evolentaTask11.operation;

import org.springframework.stereotype.Component;

@Component
public class Division implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a / b;
    }
}

