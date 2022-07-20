package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		System.out.println("data1 = " + data1);
		System.out.println("data2 = " + data2);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3[] = request.getParameterValues("data3");
		System.out.println("data1 = " + data1);
		System.out.println("data2 = " + data2);
		
		for(String str:data3) {
			System.out.println("data3 : " + str);
		}
		return "result";
	}
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	public String test(@PathVariable String data1, 
			@PathVariable String data2, 
			@PathVariable String data3){
		System.out.println("data1 = " + data1);
		System.out.println("data2 = " + data2);
		System.out.println("data3 = " + data3);
		return "result";
	}
}
