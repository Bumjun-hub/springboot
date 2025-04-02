package com.study.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class MemberEncoder {
	
	@Bean // Bean을 붙여 객체로 만듦. 컨트롤러에서 Autowired를 사용하여 객체를 사용할수 있음 
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
