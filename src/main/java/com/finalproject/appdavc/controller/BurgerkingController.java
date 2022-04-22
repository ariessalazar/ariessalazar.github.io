package com.finalproject.appdavc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BurgerkingController {

    @GetMapping ("baconking")
    public String baconking () {return "bgkingmenu/baconking";}

    @GetMapping ("bcheeseburger")
    public String bcheeseburger () {return "bgkingmenu/bcheeseburger";}

    @GetMapping ("bigfish")
    public String bigfish () {return "bgkingmenu/bigfish";}

    @GetMapping ("bigking")
    public String bigking () {return "bgkingmenu/bigking";}

    @GetMapping ("cheeseburger")
    public String cheeseburger () {return "bgkingmenu/cheeseburger";}

    @GetMapping ("doublewhopper")
    public String doublewhopper () {return "bgkingmenu/doublewhopper";}

    @GetMapping("whopperjr")
    public String whopperjr () {return "bgkingmenu/whopperjr";}

    @GetMapping("whopper")
    public String whopper () {return "bgkingmenu/whopper";}

    @GetMapping("familybundlec")
    public String familybundlec () {return "bgkingmenu/familybundlec";}
}
