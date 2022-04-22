package com.finalproject.appdavc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("kfc")
    public String kfc() {
        return "menu/kfc";
    }

    @GetMapping("mcdo")
    public String mcdo() {
        return "menu/mcdo";
    }

    @GetMapping("bgking")
    public String bgking() {
        return "menu/bgking";
    }
}
