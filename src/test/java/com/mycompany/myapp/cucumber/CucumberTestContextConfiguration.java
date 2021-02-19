package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.Test34App;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = Test34App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
