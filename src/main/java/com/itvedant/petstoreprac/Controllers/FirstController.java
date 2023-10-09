package com.itvedant.petstoreprac.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @RequestMapping("/message")
    @ResponseBody //this message will convert/serialize the string data in JSON format
    public String getMessage() {
        // we are geeting error herer
        // because front was expecting the name of some html file
        // but we don't want to send some html file
        // rather we want to send the string data embedded as JSON
        // bydefault it will expect the html file
        return "Welcome to Rest API";
    }

}
