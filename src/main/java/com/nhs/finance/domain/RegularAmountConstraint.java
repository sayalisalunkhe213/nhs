package com.nhs.finance.domain;

import com.nhs.finance.model.Frequency;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = RegularAmountValidator.class)
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface RegularAmountConstraint {

    String message() default "Invalid amount";

    String amount();

    Frequency frequency();

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}