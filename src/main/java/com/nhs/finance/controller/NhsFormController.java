package com.nhs.finance.controller;

import com.nhs.finance.model.RegularAmount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Controller class to define API
 */
@Controller
public class NhsFormController {

    @GetMapping("/user")
    public String loadFormPage(Model model) {
        model.addAttribute("regularAmount", new RegularAmount());
        return "userHome";
    }

    @PostMapping("/user")
    public String submitForm(@Valid RegularAmount regularAmount,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "userHome";
        }
        model.addAttribute("message", "Valid form");
        return "userHome";
    }
}