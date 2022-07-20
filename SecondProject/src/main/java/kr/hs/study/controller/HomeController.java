package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
//	get방식으로 /에 접속했을때 아래 메소드(home)를 실행해라
	public String home() {
		System.out.println("home");
		return "WEB-INF/views/index.jsp";
//		return "index";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
		return "add";
	}
//	/test로 접속했을 때 test콘솔로 출력
}
