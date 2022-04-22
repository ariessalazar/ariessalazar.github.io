package com.finalproject.appdavc.controller;

import com.finalproject.appdavc.dto.UserDTO;
import com.finalproject.appdavc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("register")
public class RegistrationController {

    /*private static final String CUSTOMER_ROLE = "ROLE_CUSTOMER";*/
    private static final String ADMIN_ROLE = "ROLE_ADMIN";

    @Autowired
    private UserService userService;

    @GetMapping
    private String index(Model model) {
        model.addAttribute("user", new UserDTO());
        return "register/index";
    }

    @PostMapping
    private String register(UserDTO userDTO, Model model) {
        userDTO.setRole(ADMIN_ROLE);
        userService.add(userDTO);
        return "redirect:/login";
    }

}
