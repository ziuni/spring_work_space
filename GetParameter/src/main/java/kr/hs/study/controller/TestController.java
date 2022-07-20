package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	@GetMapping("/result/{a}/{b}/{c}")
	public String result(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		return "result";
	}
	
	@GetMapping("/test5")
	public String test5(@RequestParam int data1, 
						@RequestParam(defaultValue = 0) int data2, 
						@RequestParam int [] data3) {
		System.out.println(data1);
		System.out.println(data2);
		for(int str: data3) {
			System.out.println("data3 = " + str);
		}
		return "result";
	}
}
