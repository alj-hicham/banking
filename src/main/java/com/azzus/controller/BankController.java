package com.azzus.controller;

import com.azzus.Entity.User;
import com.azzus.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by azzus on 2/12/2018.
 */
@Controller
public class BankController {
@Autowired
private UserService userService;
    @RequestMapping(value = "/")
    public String index() {

        return "redirect:/index";
    }

    @RequestMapping(value = "/index")
    public String home() {

        return "index";
    }


    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") User user, Model model) {
if(userService.checkUserExists(user.getUsername(), user.getEmail())){
    if(userService.checkEmailExists(user.getEmail())){
        model.addAttribute("emailExists", true);
    }
if(userService.checkUsernameExists(user.getUsername())){
        model.addAttribute("usernameExists", true);
}
return "signup";
}else{
    userService.save(user);
    return"redirect:/";
}


    }
}