package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
//	get������� /�� ���������� �Ʒ� �޼ҵ�(home)�� �����ض�
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
//	/test�� �������� �� test�ַܼ� ���
}
