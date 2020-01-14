package bootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value="/Login" ,method=RequestMethod.GET)
	public String showLoginForm(){
		return "Login";
	}


@RequestMapping(value="/Login",method=RequestMethod.POST)
public ModelAndView validate(@ModelAttribute("Login") Login login){
	ModelAndView mav=new ModelAndView();
	mav.addObject(login);
	mav.setViewName("Welcome");
	
	return mav;
}
}
