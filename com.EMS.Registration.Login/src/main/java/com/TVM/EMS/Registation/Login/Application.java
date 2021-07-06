package com.TVM.EMS.Registation.Login;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Autowired
    private JavaMailSender javaMailSender;

	public void sendEmailWithAttachment() throws MessagingException, IOException {

        MimeMessage msg = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(msg, true);

        helper.setTo("ruthnakumars@gmail.com");

        helper.setSubject("Policicue Forgot Password");
        helper.setText("<h1>Change your Password by click the below link</h1>", true);
        
        helper.setText("http://localhost:8080/forgot");
      

        javaMailSender.send(msg);

    }
	
}
