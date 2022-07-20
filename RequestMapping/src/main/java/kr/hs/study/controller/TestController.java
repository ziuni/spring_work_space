package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {
	@GetMapping("/result/{a}/{b}/{c}")
	public String result(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		return "result";
	}
}
