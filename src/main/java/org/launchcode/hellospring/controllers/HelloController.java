package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Let Java know we are creating a controller

@Controller
public class HelloController {

    @RequestMapping(value= "")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

    // Creates the route /goodbye
    @RequestMapping(value= "goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye";
    }
}
