package com.asmj6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.asmj6.interceptor.GlobalInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	
	@Autowired
	GlobalInterceptor gloInter;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(gloInter).addPathPatterns("/**").excludePathPatterns("/rest/**", "/admin/**",
				"/assets/**");
	}
}
