package com.nhs.finance.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class NhsFormControllerTest {
    private MockMvc mockMvc;

    @BeforeEach
    public void setup(){
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(new NhsFormController()).build();
    }

    /*@Test
    public void givenMatchingEmailPassword_whenPostNewUserForm_thenOk()
            throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                .post("/user")
                .accept(MediaType.TEXT_HTML)
                .param("amount", "400.4")
                .param("frequency", "TWO_WEEK"))
                .andExpect(model().errorCount(0))
                .andExpect(status().isOk());
    }*/
}

