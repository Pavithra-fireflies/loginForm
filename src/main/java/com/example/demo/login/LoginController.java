package com.example.demo.login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.form.LoginForm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller 
public class LoginController {
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm()
	{
		return "login";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm , Model model  )
	{
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		if(username.equals("fresherpro") && password.equals("fresherpro"))
		{
			return "home";
		}
		model.addAttribute("invalidCredentials", true);
		return "login";
	}
	
	
}
