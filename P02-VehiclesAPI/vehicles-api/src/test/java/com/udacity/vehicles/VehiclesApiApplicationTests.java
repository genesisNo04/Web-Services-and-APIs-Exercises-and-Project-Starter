package com.udacity.vehicles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehiclesApiApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }


}
