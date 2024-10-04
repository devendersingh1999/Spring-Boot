package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TrignoController {
		
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
		@RequestMapping("calc")
		
		public String calc(@RequestParam("angle") String angle, @RequestParam("func") String func, Model model) {
			float deg=Integer.parseInt(angle);
			double rad=Math.toRadians(deg);
			double result=0;
			
			switch(func) {
			case "sin": {
				result = Math.sin(rad);
				break;
			}
			case "cos": {
				result = Math.cos(rad);
				break;
			}
			case "tan": {
				result = Math.tan(rad);
				break;
			}
			case "cot": {
				result = 1/Math.tan(rad);
				break;
			}
			
			case "sec": {
				result = 1/Math.cos(rad);
				break;
			}
			case "cosec": {
				result = 1/Math.sin(rad);
				break;
			}
			default : {
				result = 0;
			}
		}
	
			
			model.addAttribute("angle", angle);
			model.addAttribute("func", func);
			model.addAttribute("result", result);
			return "result.jsp";
		}
		}
