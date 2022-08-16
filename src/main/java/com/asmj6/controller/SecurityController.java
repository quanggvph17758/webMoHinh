package com.asmj6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	@RequestMapping("/security/login/form")
	public String loginForm(Model mol) {
		
		mol.addAttribute("message", "Vui lòng đăng nhập");
		
		return "security/login";
	}
	
	@RequestMapping("/security/login/success")
	public String loginSuccess(Model mol) {
		
		mol.addAttribute("message", "Đăng nhập thành công");
		
		return "redirect:/product/list";
	}
	
	@RequestMapping("/security/login/error")
	public String loginError(Model mol) {
		
		mol.addAttribute("message", "Đăng nhập thất bại");
		
		return "security/login";
	}
	
	@RequestMapping("/security/login/unauthoried")
	public String loginUnauthoried(Model mol) {
		
		mol.addAttribute("message", "Không có quyền truy xuất");
		
		return "security/login";
	}
	
	@RequestMapping("/security/logoff/success")
	public String logoffSuccess(Model mol) {
		
		mol.addAttribute("message", "Đăng xuất thành công");
		
		return "security/login";
	}
}
