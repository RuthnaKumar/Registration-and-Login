package com.TVM.EMS.Registation.Login.Controller;



import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TVM.EMS.Registation.Login.Application;
import com.TVM.EMS.Registation.Login.Dto.UserRegistrationDto;
import com.TVM.EMS.Registation.Login.Service.UserService;




@Controller


@RequestMapping("/registration")
public class UserRegistrationController {
	private UserService userService;
	
	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto()
	{
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String showRegistrationForm()
	{
		return "registration";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) 
	{
		userService.save(registrationDto);
		return "success";
	}
	
}	
	

	



