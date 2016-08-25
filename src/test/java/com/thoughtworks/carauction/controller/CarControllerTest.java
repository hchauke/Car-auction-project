package com.thoughtworks.carauction.controller;


import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * We can use @Mock to create and inject mocked instances without having to call Mockito.mock manually.
 */

public class CarControllerTest {

    private MockMvc mockMvc;

    private CarController controller;


    @Before
    public void setUp() throws Exception {

        controller  = new CarController();

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/views");

        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setViewResolvers(viewResolver)
                .build();

    }

    @Test
    public void verifyThatTheViewNameIsHomePage() throws Exception {

        mockMvc.perform(get("/all-cars"))
                .andExpect(view().name("home-page"));
    }

    @Test
    public void verifyTheHTTPStatusIsOkay() throws Exception {

        mockMvc.perform(get("/all-cars"))
                .andExpect(status().isOk());

    }


}
