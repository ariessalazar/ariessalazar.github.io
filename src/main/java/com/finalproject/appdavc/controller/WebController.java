package com.finalproject.appdavc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("faq")
    public String faq(){
        return "faq";
    }

    @GetMapping("about")
    public String aboutus ()
    {
        return "about";
    }

    /*@GetMapping("my-account")
    public  String myaccount () {
        return "my-account/index";
    }*/

    @GetMapping("order-confirmation")
    public  String orderconfirmation () {
        return "order-confirmation";
    }


}
