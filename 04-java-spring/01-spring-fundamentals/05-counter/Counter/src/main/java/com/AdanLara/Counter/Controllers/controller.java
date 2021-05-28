package com.AdanLara.Counter.Controllers;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
	public class controller {
		@GetMapping("/")
		public String mainPage(HttpSession session) {
		if(session.getAttribute("count")==null){
			session.setAttribute("count",0);
		}
		Integer currentCount= (Integer) session.getAttribute("count");
		currentCount++;
		session.setAttribute("count",currentCount);
		
		return"index.jsp";
	}
		@GetMapping("/count")
		public String counter(HttpSession session) {
			if(session.getAttribute("count")==null){
				session.setAttribute("count",0);
			}
			return "count.jsp";
		}
		@GetMapping("/reset")
		public String rerset(HttpSession session) {
			session.invalidate();
			return "redirect:/";
		}
		@GetMapping("/twoCount")
		public String plusTwo(HttpSession session) {
			
			if(session.getAttribute("count")==null){
				session.setAttribute("count",0);					
			}
			Integer currentCount= (Integer)session.getAttribute("count");
			currentCount=currentCount+2;
			session.setAttribute("count", currentCount);
			
			return "PlusTwo.jsp";
		}
}