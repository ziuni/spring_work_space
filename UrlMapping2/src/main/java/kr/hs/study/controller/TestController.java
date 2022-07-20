package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
//	@GetMapping("/test1")
//	public String Test1() {
//		return "result";
//	}
//	
//	@GetMapping("/sub1/test3")
//	public String Sub1Test3() {
//		return "result";
//	}
//
//	@GetMapping("/sub1/test4")
//	public String Sub1Test4() {
//		return "result";
//	}
//
//	@GetMapping("/sub2/test5")
//	public String Sub2Test5() {
//		return "result";
//	}
//
//	@GetMapping("/sub2/test6")
//	public String Sub2Test6() {
//		return "result";
//	}
//
//	@GetMapping("/sub2/test7")
//	public String Sub2Test7() {
//		return "result";
//	}
	
	@GetMapping("/test5")
	public String test5() {return "result";}

	@GetMapping("/test6")
	public String test6() {return "result";}

	@GetMapping("/test7")
	public String test7() {return "result";}
	
}
