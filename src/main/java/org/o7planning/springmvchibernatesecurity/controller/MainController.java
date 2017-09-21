package org.o7planning.springmvchibernatesecurity.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@Transactional
public class MainController {
 
   @RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
   public String loginPage(Model model ) {
       System.out.println("loginPage()=========MainController");
       return "loginPage";
   }
 
   @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
   public String userInfo(Model model, Principal principal) {
       System.out.println("userInfo()=========MainController");
       // After user login successfully.
       String userName = principal.getName();
 
       System.out.println("User Name: "+ userName);
 
       return "userInfoPage";
   }
 
}
