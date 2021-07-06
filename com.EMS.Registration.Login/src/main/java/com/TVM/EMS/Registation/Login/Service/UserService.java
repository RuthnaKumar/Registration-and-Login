package com.TVM.EMS.Registation.Login.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.TVM.EMS.Registation.Login.Dto.UserRegistrationDto;
import com.TVM.EMS.Registation.Login.Model.User;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
