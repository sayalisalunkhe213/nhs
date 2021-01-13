package com.nhs.finance.model;


import com.nhs.finance.domain.RegularAmountConstraint;
import lombok.Data;

@RegularAmountConstraint(
    amount = "aaa",
    frequency = Frequency.FOUR_WEEK,
    message = "Not a valid amount!"
)
@Data
public class RegularAmount {

    private Frequency frequency;

    private String amount;

}

