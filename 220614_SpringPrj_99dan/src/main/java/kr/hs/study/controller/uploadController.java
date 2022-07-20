package kr.hs.study.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class uploadController {
	@Autowired
	@Qualifier("uploadPath")
	private String uploadPath = "C:\\";
	
	@GetMapping("/upload")
	public String upload() {
		return "upload/upload_form";
	}
	
	@PostMapping("/upload")
	public ModelAndView re_upload(MultipartFile mpfile, ModelAndView mv) throws IOException {
//			@RequestParam("userfile") MultipartFile file, ModelAndView mv
//			���ε��ϴ� ���Ͽ� ���� ������ ��� ���� �ִ� file
		System.out.println("filename : " + mpfile.getOriginalFilename());
		System.out.println("filesize : " + mpfile.getSize());
		System.out.println("filetype : " + mpfile.getContentType());
		System.out.println("filename2 : " + mpfile.getName());
		
		String savedName = mpfile.getOriginalFilename();
		File a = new File(uploadPath, savedName);
//			���� tmp������ are9328���� �̸��� �츮�� ������� �������ٴ� ��
		FileCopyUtils.copy(mpfile.getBytes(), a);
		mv.setViewName("upload/uploadResult");
		mv.addObject("savedName", savedName);
		
		return mv;
	}
	
}
