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

import kr.hs.study.model.DataBean;

@Controller
public class TestController {
//	@PostMapping("/test1")
//	public String test1(DataBean bean, Model model) {
//		model.addAttribute("bean", bean);
//		return "re_test1";
//	}
	//request영역에 객체이름 지정해서 저장하는 방법
	@PostMapping("/test1")
	public String test1_(@ModelAttribute("testbean") DataBean databean, Model model){
		return "re_test1";
		
	}
}
