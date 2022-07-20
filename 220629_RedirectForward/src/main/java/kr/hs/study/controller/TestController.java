package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "redirect:result1";
	}
	
	@GetMapping("result1")
	public String result1() {
		return "result1";
	}
	

	@GetMapping("/test2")
	public String test2() {
		return "forward:result2";
	}
	@GetMapping("result2")
	public String result2() {
		return "result2";
	}
}
