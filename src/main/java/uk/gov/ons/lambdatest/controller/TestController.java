package uk.gov.ons.lambdatest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class TestController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String testMethod() {
        return "Test Worked!!";
    }

}
