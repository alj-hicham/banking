package com.azzus.controller;

import com.azzus.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by azzus on 2/12/2018.
 */
@Controller
public class BankController {

    @RequestMapping(value="/")
public String index(){

return "redirect:/index";}
    @RequestMapping(value="/index")
    public String home(){

        return "index";}


    @RequestMapping(value="/signup" ,method= RequestMethod.POST)
    public String signup(Model model){
        User user = new User();
        model.addAttribute("user",user);
    return "signup";
    }
}
