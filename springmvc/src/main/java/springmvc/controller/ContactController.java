package springmvc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
    
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Lear code with kumar");
		m.addAttribute("Desc", "Home for programmer");
		System.out.println("adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
	    System.out.println("Creating form");
		return "contact";
		
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	{
        System.out.println("user");
        
        if (user.getName().isBlank()) {
        	return "redirect:/contact";
        }
        
        if(user.getEmail().isBlank()) {
        	return "redirect:/contact";
        }
        
        if(user.getPassword().isBlank()) {
        	return "redirect:/contact";
        }
        
        //process
        int createdUser = this.userService.createUser(user);
        model.addAttribute("msg", "User created with id " +createdUser);
		return "success";
	}
}



/*
  @RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("name")String name, 
			@RequestParam("email") String email, 
			@RequestParam("password") String password, Model model)
	{
		System.out.println("user name "+name);
		System.out.println("user email "+email);
		System.out.println("user password "+password);
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		
		System.out.println(user);
		
		//process
		
//		model.addAttribute("name", name);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);

		model.addAttribute("user", user);
		return "success";
*/