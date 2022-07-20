package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test2";
	}
	@GetMapping("/test3")
	public String test3(Model model){
		model.addAttribute("data3", 300);
		model.addAttribute("data4", 300);
		return "test3";
	}
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv){
		//view이름 지정
		mv.setViewName("test4");
		mv.addObject("data1",1000);
		mv.addObject("data2",2000);
		return mv;
	}
}
