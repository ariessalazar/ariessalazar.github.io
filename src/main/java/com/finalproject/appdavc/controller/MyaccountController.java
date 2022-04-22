
package com.finalproject.appdavc.controller;


import com.finalproject.appdavc.dto.AddressDTO;
import com.finalproject.appdavc.dto.UserDTO;
import com.finalproject.appdavc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller

@RequestMapping("my-account")
public class MyaccountController {

    @Autowired
    private UserService userService;


    @GetMapping
    private String index(Model model) {
        model.addAttribute("users", new UserDTO());
        return "my-account/index";
    }

    /*@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String currentUser(Principal principal) {
        return principal.getName();
    }*/

    @GetMapping("/{id}")
    private String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.get(id));
        return "my-account/index";
    }

    @PutMapping
    private String updateUser(UserDTO user, Model model) {
        userService.update(user);
        return index(model);
    }


}
