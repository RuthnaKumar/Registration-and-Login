package com.TVM.EMS.Registation.Login.Controller;



import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TVM.EMS.Registation.Login.Application;




@Controller


@RequestMapping("/registration1")
public class UserRegistrationController1 {
	@Autowired
	Application sendingEmailApplication;
  @GetMapping
	public String send() throws AddressException, MessagingException, IOException {
		
		sendingEmailApplication.sendEmailWithAttachment();
	   return "forgot";   
	}
	
	


	
}	
	

	



