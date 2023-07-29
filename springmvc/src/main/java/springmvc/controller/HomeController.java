package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path="/home", method = RequestMethod.GET)
	  public String home(Model model)
	  {
		System.out.println("Hello this is home url ");
		model.addAttribute("name", "kumar mijar");
		model.addAttribute("id", 122);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Vandana");
		friends.add("Gopal");
		friends.add("Sompal");
		
		model.addAttribute("f", friends);
		  return "index";
	  }
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		{
			System.out.println("This is help controller");
			//creating model and view object
			ModelAndView modelAndView = new ModelAndView();
			
			//setting the data
			modelAndView.addObject("name","Rohan");
			modelAndView.addObject("rollnumber", 1223);
			LocalDateTime now = LocalDateTime.now();
			modelAndView.addObject("time", now);
			
			//marks
			List<Integer> list = new ArrayList<Integer>();
			list.add(13);
			list.add(140);
			modelAndView.addObject("marks", list);
			//setting the view name
			modelAndView.setViewName("help");
			return modelAndView;
		}
	}
}
