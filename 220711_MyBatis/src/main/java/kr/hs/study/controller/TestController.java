package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.DataBean;
import kr.hs.study.service.dataInterface;

@Controller
public class TestController {
	@Autowired
	private dataInterface dataIn; //service1
	
	@GetMapping("input_data")
	public String input_data() {
		return "input_data";
	}

	@PostMapping("input_pro")
	public String input_pro(DataBean bean) {
//		모델 어트리뷰트는 생략 가능
		dataIn.insert(bean);
		System.out.println("data1 : " + bean.getData1());
		System.out.println("data2 : " + bean.getData2());
		System.out.println("data3 : " + bean.getData3());
		return "result";
	}
	
	@GetMapping("read_data")
	public String read_data(Model model) {
		List<DataBean> list = dataIn.select();
		System.out.println("list size : " + list.size());
		model.addAttribute("list", list);
		return "read_result";
	}
	
	@GetMapping("/update_data")
	public String update_data_form() {
		return "update_data_form";
	}
	@PostMapping("/update_pro")
	public String update_pro(DataBean dto) {
		dataIn.update(dto);
		return "result";
	}
	
	@GetMapping("/delete_data")
	public String delete_data(@RequestParam("data1") String data1) {
		dataIn.delete(data1);
		return "result";
		
	}
}
