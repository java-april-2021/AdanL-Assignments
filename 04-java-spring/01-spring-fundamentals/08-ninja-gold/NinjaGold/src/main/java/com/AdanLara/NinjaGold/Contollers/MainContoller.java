package com.AdanLara.NinjaGold.Contollers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainContoller {
	@GetMapping("/")
	public String mainPage(HttpSession session) {
		ArrayList<String> activity= new ArrayList<String>();
		if(session.getAttribute("currentGold")==null) {
			session.setAttribute("currentGold", 0);
		}	
		if(session.getAttribute("activity")==null) {
			session.setAttribute("activity",activity);
		}
		return "NGold.jsp";
	}
	@PostMapping("/findgold")
	public String farm(HttpSession session, @RequestParam("place") String place) {
		
		LocalDateTime now= LocalDateTime.now();
		DateTimeFormatter form= DateTimeFormatter.ofPattern("MMM dd YYYY h:mma");
		ArrayList<String> activity=(ArrayList<String>) session.getAttribute("activity");
		Random r=new Random();
		
		int currentGold = (int) session.getAttribute("currentGold");
		int goldAdded;
		
			if(place.equals("farm")) {		
				goldAdded = r.nextInt((20-10)+1)+10;		
				activity.add(String.format("You entered a %s and got %s gold %s \n", place, goldAdded,now));
			}
			else if(place.equals("cave")) {
				goldAdded = r.nextInt((10-5)+1)+5;
				activity.add(String.format("You entered a %s and got %s gold %s \n", place, goldAdded,now));				
			}
			else if(place.equals("house")) {
				goldAdded = r.nextInt((5-2)+1)+2;
				activity.add(String.format("You entered a %s and got %s gold %s \n", place, goldAdded,now));				
			}
			else{
				goldAdded = r.nextInt((50+50)+1)-50;
				if(goldAdded<0) {
					activity.add(String.format("You entered a %s and lost %s gold %s...ouch \n", place, goldAdded,now));			
				}
				else { activity.add(String.format("You entered a %s and got %s gold %s \n", place, goldAdded,now));			
			}
			}
		int totalGold =currentGold+ goldAdded;
		session.setAttribute("currentGold", totalGold);	
		session.setAttribute("activity",activity);
		
		return "redirect:/";
	}
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
		}
}
