package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CalculatorMap {

//		display form
		@RequestMapping("/")
		public String home() {
			return "cal.jsp";
		}
@RequestMapping("/cal")
public String calculate(@RequestParam("a") String a, @RequestParam("b") String b,
		@RequestParam("opr") String opr, Model model) {
	
	int result=0;
	int num1=Integer.parseInt(a); 
	int num2=Integer.parseInt(b); 
	
	switch(opr) {
	case "add": {
		result = num1 + num2;
		break;
	}
	case "sub": {
		result = num1 - num2;
		break;
	}
	case "mul": {
		result = num1 * num2;
		break;
	}
	case "div": {
		if(num2 != 0) {
			result = num1 / num2;
		} else {
			result = 0;
		}
		break;
	}
	default: result = 0;
}
	System.out.println(result);
	model.addAttribute("a", a);
	model.addAttribute("b", b);
	model.addAttribute("opr", opr);
	model.addAttribute("result", result);
	return "calResult.jsp";
	
}
}

