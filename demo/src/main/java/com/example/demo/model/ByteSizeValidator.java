package com.example.demo.model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ByteSizeValidator implements ConstraintValidator<ByteSize, String> {
    private int min;
    private int max;

    @Override
    public void initialize(ByteSize constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if( value.getBytes().length > min && value.getBytes().length < max ) {
            System.out.println(min + " " + max + " " + value.getBytes().length);
            return true;
        } else
            System.out.println(min + " " + max + " " + value.getBytes().length);
            return false;
    }
}
