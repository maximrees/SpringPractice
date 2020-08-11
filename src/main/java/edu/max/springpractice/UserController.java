package edu.max.springpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class UserController {
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping(method = GET, path = "/test")
    public String homePage(){
        System.out.println("usercontroller");
//        model.addAttribute("appName", appName);

        return "home";
    }
}
