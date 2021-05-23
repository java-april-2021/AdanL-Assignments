package com.AdanLara.Events.Controllers;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.AdanLara.Events.Models.Event;
import com.AdanLara.Events.Models.User;
import com.AdanLara.Events.Services.CommentService;
import com.AdanLara.Events.Services.EventService;
import com.AdanLara.Events.Services.UserService;
import com.AdanLara.Events.Validators.UserValidator;

@Controller
public class MainController {
	@Autowired
	private UserService uServ;
	@Autowired
	private UserValidator uValid;
	@Autowired
	private EventService eServ;
	@Autowired
	private CommentService cServ;
	
	@GetMapping("/")
	public String mainPage(Model viewModel,@ModelAttribute("newUser") User newUser) {
		return "LoginReg.jsp";
	}
	
	@PostMapping("/register")
	public String registerNewUser(@Valid @ModelAttribute("newUser") User newUser, BindingResult result ,HttpSession session) {
		uValid.validate(newUser, result);
		if(result.hasErrors()) {
			return "LoginReg.jsp";
		}
		User user=this.uServ.registerUser(newUser);
		session.setAttribute("user__Id", user.getId());
		return "redirect:/events";
	}
	@PostMapping("/login")
	public String login(@RequestParam("loginPass") String password, @RequestParam("loginEmail") String email, RedirectAttributes rediAtt, HttpSession session) {
		if(!this.uServ.authenticateUser(password, email)) {
			rediAtt.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		User user= this.uServ.getByEmail(email);
		session.setAttribute("user__Id", user.getId());
		
		return "redirect:/events";
	}
	
	@GetMapping("/events")
	public String events(HttpSession session, Model viewModel,@ModelAttribute("newEvent") Event newEvent) {
		if(session.getAttribute("user__Id")==null) {
			return "redirect:/"; 
		}
		Long userId=(Long)session.getAttribute("user__Id");	
		User user= this.uServ.getUser(userId);
		viewModel.addAttribute("user",this.uServ.getUser(userId));
		viewModel.addAttribute("events",this.eServ.findEventsByLocation(user.getLocation()));
		viewModel.addAttribute("otherEvents",this.eServ.findEventsByOtherLocations(user.getLocation()));
		return "Events.jsp";
	}
	@PostMapping("/create")
	public String createEvent(@Valid @ModelAttribute("newEvent") Event newEvent, BindingResult result, HttpSession session,Model viewModel) {
		if(result.hasErrors()) {
			Long userId=(Long)session.getAttribute("user__Id");
			viewModel.addAttribute("user",this.uServ.getUser(userId));
			return "Events.jsp";
		}
		this.eServ.createEvent(newEvent);
		return "redirect:/events";
	}
	@GetMapping("/attend/{id}")
	public String attendEvent(@PathVariable("id") Long id, HttpSession session) {
		if(session.getAttribute("user__Id")==null) {
			return "redirect:/"; 
			}
		Long userId=(Long)session.getAttribute("user__Id");
		User user= this.uServ.getUser(userId);
		Event event= this.eServ.getEvent(id);
		this.eServ.addAttendee(user, event);
		return "redirect:/events";
	}
	
	@GetMapping("/notGoing/{id}")
	public String notGoingToEvent(@PathVariable("id") Long id, HttpSession session) {
		if(session.getAttribute("user__Id")==null) {
			return "redirect:/"; 
			}
		Long userId=(Long)session.getAttribute("user__Id");
		User user= this.uServ.getUser(userId);
		Event event= this.eServ.getEvent(id);
		this.eServ.removeAttendee(user, event);
		return "redirect:/events";
	}
	
	@GetMapping("/event/{id}")
	public String showEvent(@PathVariable("id") Long id, HttpSession session, Model viewModel) {
		if(session.getAttribute("user__Id")==null) {
			return "redirect:/"; 
			}
		Event event = this.eServ.getEvent(id);
		viewModel.addAttribute("event", event);
		return "ShowEvent.jsp";
	}
	@PostMapping("/event/{id}")
	public String postComment(@RequestParam("content") String content, RedirectAttributes redAtt ,@PathVariable("id") Long id, HttpSession session, Model viewModel) {		
		if(session.getAttribute("user__Id")==null) {
			return "redirect:/"; 
			}
		if(content.equals("")) {
			redAtt.addFlashAttribute("error", "Comment must not be blank");
			return "redirect:/events/" + id ; 
		
		}
		Event event = this.eServ.getEvent(id);
		Long userId= (Long)session.getAttribute("user__Id");
		User user= this.uServ.getUser(userId);

		this.cServ.saveComment(content,event,user);
		
		return "redirect:/event/"+id;
	}
	//edit event
	@GetMapping("/event/edit/{id}")
	public String editEvent(@PathVariable("id") Long id, HttpSession session,Model viewModel,@ModelAttribute("event") Event updatedEvent) {
		if(session.getAttribute("user__Id")==null) {
			return "redirect:/"; 
			}
			viewModel.addAttribute("event",eServ.getEvent(id));
		return "EditEvent.jsp";
		
	}
	@PostMapping ("/event/edit/{id}")
	public String editEvent(@Valid @ModelAttribute("updatedEvent") Event updatedEvent, BindingResult result,@PathVariable("id") Long id ,HttpSession session,Model viewModel){
		if(session.getAttribute("user__Id")==null) {
			return "redirect:/"; 
		}
		if(result.hasErrors()) {
			viewModel.addAttribute("event",eServ.getEvent(id));
			return "EditEvent.jsp";
			}
		this.eServ.createEvent(updatedEvent);
		return "redirect:/event/edit/"+id;
	}
	//delete event
	@GetMapping("/delete/{id}")
	public String deleteEvent(@PathVariable("id") Long id) {

		this.eServ.deleteEvent(id);
		return "redirect:/events";
	}
	
	//logout
	@GetMapping("/logout")
	public String logout(HttpSession session) { 
		session.invalidate();
		return "redirect:/";
	}
	
}
















