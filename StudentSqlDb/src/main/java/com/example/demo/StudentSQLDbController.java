package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentSQLDbController {
	
	@Autowired
	private JdbcTemplate temp;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("addStudent")
	public String addStudent(@RequestParam("name") String name ,
			                 @RequestParam("age") String age ,
			                 @RequestParam("gender") String gender,
			                 Model model) {
		
		int Age=Integer.parseInt(age);
		
		String sql="insert into studentdetails(name, age, gender ) values(?,?,?)"; 
		temp.update(sql, name, Age, gender);
		
		model.addAttribute("name", name);
		model.addAttribute("age", Age);
		model.addAttribute("gender", gender);
		
		
		return "result.jsp";
	}

}
