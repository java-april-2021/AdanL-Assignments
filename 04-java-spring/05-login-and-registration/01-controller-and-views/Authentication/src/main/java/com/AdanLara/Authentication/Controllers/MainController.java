package com.AdanLara.Authentication.Controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.AdanLara.Authentication.Models.User;
import com.AdanLara.Authentication.Service.UserService;
import com.AdanLara.Authentication.Validations.UserValidations;

@Controller
public class MainController {
	@Autowired
	private UserService uServ;
	@Autowired
	private UserValidations uValid;

	
    @GetMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    
    @GetMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @PostMapping("/registration")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        if(result.hasErrors()) {
        	return "registrationPage.jsp";
        }
        User u = uServ.registerUser(user);
        session.setAttribute("userId", u.getId());
        return "redirect:/home";
    }
    
    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
    	Long userId =(Long) session.getAttribute("userId");
        User u =uServ.findUserById(userId);
        model.addAttribute("loginUser",u);
        return "HomePage.jsp";
    }
    
   
    @PostMapping("/login")
    public String userLogin(@RequestParam("email") String email,@RequestParam("password") String password, HttpSession session, Model viewModel) {
    	boolean isRight= uServ.authenticateUser(email, password);
    	if(isRight) {
    		User u = uServ.findByEmail(email);
    		session.setAttribute("userId", u.getId());
    		return "redirect:/home";
    	}
    	else {
    		viewModel.addAttribute("error", "Invalid Credentials. Try Again");
    		return "loginPage.jsp";
    	}
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
        return "redirect:/login"; 
    }
}
