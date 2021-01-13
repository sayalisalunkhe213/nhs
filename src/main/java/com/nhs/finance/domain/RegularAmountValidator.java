package com.nhs.finance.domain;

import com.nhs.finance.model.Frequency;
import org.springframework.beans.BeanWrapperImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RegularAmountValidator implements
        ConstraintValidator<RegularAmountConstraint, Object> {

    private String amount;

    private Frequency frequency;

    @Override
    public void initialize(RegularAmountConstraint constraintAnnotation) {
        this.amount = constraintAnnotation.amount();
        this.frequency = constraintAnnotation.frequency();
    }

    @Override
    public boolean isValid(Object value,
                           ConstraintValidatorContext cxt) {

        Object amountValue = new BeanWrapperImpl(value)
                .getPropertyValue(amount);
        Object frequencyValue = new BeanWrapperImpl(value)
                .getPropertyValue(String.valueOf(frequency));

        int denominator;

        if (null != frequencyValue.toString()) {

            if (frequencyValue.toString().matches("TWO_WEEK|FOUR_WEEK|QUARTER|YEAR")) {

                switch (frequencyValue.toString()) {
                    case "TWO_WEEK": denominator = 2;
                        break;
                    case "FOUR_WEEK": denominator = 4;
                        break;
                    case "QUARTER": denominator = 13;
                        break;
                    case "YEAR": denominator = 52;
                        break;
                    default: denominator = 1;
                        break;
                }

                Double amount = Double.parseDouble(amountValue.toString());

                if ((amount / denominator) % 1 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}