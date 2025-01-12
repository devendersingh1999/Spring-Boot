package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class UdemyController {
	
	
	@Autowired
	private JdbcTemplate template;
	
	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	
	
//	   Display signup page
	  @GetMapping("/")
	  public String signupForm() {
		  
      return "signup.jsp";
  }
		
	@PostMapping("signup")
	
		public String signup( @ModelAttribute UserDetails userdetails, Model model) {
		
		String encodedPassword=encoder.encode(userdetails.getPassword());
		
       // Check if user already exists
		int status=template.queryForObject("Select count(*) from userDetails where email=? ",
				                               Integer.class, userdetails.getEmail());
		
		if(status>0) {
			
			model.addAttribute("error", "Already have a account");
			return "error.jsp";
		}
		else {
          // Insert new user details into the database
			String sql="insert into userDetails (name, email, password) values(?,?,?)";
			
			template.update(sql,
					userdetails.getName(),
					userdetails.getEmail(),
					encodedPassword);
			
			return "login.jsp";
		}
}
	   // Display login page
		  @GetMapping("login")
		  public String loginForm() {
		      return "login.jsp";
		  }
	
	
	@PostMapping("/login")
	
	public String login(@ModelAttribute UserDetails userdetails, HttpSession session, Model model) {
	    
	    // Try to get the stored password from the database
		try {
	    String storedPassword = template.queryForObject("select password from userDetails where email=?", 
	    		                                             String.class, userdetails.getEmail());
	    
	    // Check if the entered password matches the stored password
	    if (storedPassword != null && encoder.matches(userdetails.getPassword(), storedPassword)) {
	        session.setAttribute("email", userdetails.getEmail());
	        return "home.jsp";
	    } else {
	        // Add error message to the model
	        model.addAttribute("error", "Incorrect password");
	        // Add entered email back to the form (to keep it prefilled)
	        model.addAttribute("email", userdetails.getEmail());
	        return "error.jsp";  // Redirect back to the login page
	    }
	    }
		catch(Exception e) {
			model.addAttribute("error", "Email is not registered");
			return "error.jsp";
			
		}
	}

	   // Handle logout
    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";  // Redirect to login page after logout
    }

	}

