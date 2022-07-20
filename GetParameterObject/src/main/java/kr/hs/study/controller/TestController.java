package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;

@Controller
//(@Component)
public class TestController {
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		System.out.println(data1 + "       " + data2);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test5(@RequestParam Map<String,String> map, 
			@RequestParam List<String> data3) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		for(String str:data3) {
			System.out.println("data3 : " + str);
		}
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(DataBean bean) {
//		빈 객체에 요청되 ㄴ값을 자동주입-오토와이어드 해라
		System.out.println(bean.getData1());
		System.out.println(bean.getData2());
		System.out.println(bean.getData3());
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(DataBean2 bean2) {
		System.out.println("data1 "+bean2.getData1());
		System.out.println("data2 "+bean2.getData2());
		
		for(int num:bean2.getData3()) {
			System.out.println("data3 : " + num);
		}
		return "result";
	}
	
	@GetMapping("test5")
	public String test4(DataBean3 bean3) {
		System.out.println("data1 "+bean3.getData1());
		System.out.println("data2 "+bean3.getData2());
		return "result";
	}
	
}
