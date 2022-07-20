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

import kr.hs.study.beans.DataBean;

@Controller
public class TestController {
	@GetMapping("/multipli")
	public String multipli() {
		return "input_form";
	}
	
	@PostMapping("/re_multipli")
	public String re_multipli(@RequestParam int num, Model model) {
		String result="";
		for(int i = 1; i <= 9; i++) {
			result += num+"X"+i+"="+i*num+"<br>";
		}
		model.addAttribute("result", result);
		return "multi_table";
	}
	
	@GetMapping("/score")
	public String score() {
		return "input_score";
	}
	
	@PostMapping("/re_score")
	public ModelAndView re_score(DataBean db, ModelAndView mv) {
		System.out.println("name = "+db.getName());
		System.out.println("kr = "+db.getKr());
		System.out.println("eng = "+db.getEng());
		System.out.println("math = "+db.getMath());
		System.out.println("spring = "+db.getSpring());
		System.out.println("total = "+db.getTot());
		System.out.println("average = "+db.getAvg());
		

		mv.setViewName("score");
		mv.addObject("name",db.getName());
		mv.addObject("kr",db.getKr());
		mv.addObject("eng",db.getEng());
		mv.addObject("math",db.getMath());
		mv.addObject("spring",db.getSpring());
		mv.addObject("tot",db.getTot());
		mv.addObject("avg",db.getAvg());
		return mv;
	}
	
	@GetMapping("/logininput")
	public String logininput() {
		return "login/loginform";
	}
	
	@PostMapping("/loginform")
	public String loginform(Model model, @RequestParam String id, @RequestParam String pw) {
		if(id.equals("kim") && pw.equals("1111")) {
			model.addAttribute("id", id);
			model.addAttribute("pw", pw);
		}else {
			return "redirect:index";
		}
		return "login/login";
	}
}
