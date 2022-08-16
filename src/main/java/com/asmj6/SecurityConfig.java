package com.asmj6;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.asmj6.bean.Accounts;
import com.asmj6.service.AccountService;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	AccountService accountservice;
//Check if forgot to create the Bean on the App main class

	@Bean
	BCryptPasswordEncoder pe() {
		return new BCryptPasswordEncoder();
	}

//cung cấp nguồn dữ liệu đăng nhập
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(username -> {
			try {
				Accounts user = accountservice.findById(username);
				String password = pe().encode(user.getPassword());
				String[] roles = user.getAuthorities().stream().map(er -> er.getRole().getId())
						.collect(Collectors.toList()).toArray(new String[0]);
				return User.withUsername(username).password(password).roles(roles).build();
			} catch (NoSuchElementException e) {
				// TODO: handle exception
				throw new UsernameNotFoundException(username + "not found!");
			}
		});
	}

//Phân quyền sử dụng
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable();
		http.authorizeHttpRequests().antMatchers("/order/**").authenticated().antMatchers("/admin/**")
				.hasAnyRole("STAF", "DIRE").antMatchers("/rest/authorities").hasRole("DIRE").anyRequest().permitAll();

		http.formLogin().loginPage("/security/login/form").loginProcessingUrl("/security/login")
				.defaultSuccessUrl("/security/login/success", false).failureUrl("/security/login/error");

		http.rememberMe().tokenValiditySeconds(86400);

		http.exceptionHandling().accessDeniedPage("/security/unauthoried");

		http.logout().logoutUrl("/security/logoff").logoutSuccessUrl("/security/logoff/success");
	}

	// cơ chế mã hóa mật khẩu
	public BCryptPasswordEncoder getPasswordEnconder() {
		return new BCryptPasswordEncoder();
	}

//cho phép truy xuất REST API từ bên ngoài (domain khác)
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
	}
}
