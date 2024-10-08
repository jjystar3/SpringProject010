package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration // 스프링 설정 클래스 설정
@EnableWebSecurity // 보안 설정
public class SecurityConfig {

	
	// 회원가입시 사용자 패스워드를 암호화하는데 사용할 인코더
	// BCrypt: 암호화 알고리즘 종류 (단방향)
    @Bean // 빈을 생성하여 컨테이너에 저장
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
