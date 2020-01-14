package sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	@RequestMapping(value="/Sample" ,method=RequestMethod.GET)
	public String showWelcomePage(){
		return "Welcome";
	}
}
