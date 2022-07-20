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
//			업로드하는 파일에 대한 정보를 모두 갖고 있는 file
		System.out.println("filename : " + mpfile.getOriginalFilename());
		System.out.println("filesize : " + mpfile.getSize());
		System.out.println("filetype : " + mpfile.getContentType());
		System.out.println("filename2 : " + mpfile.getName());
		
		String savedName = mpfile.getOriginalFilename();
		File a = new File(uploadPath, savedName);
//			대충 tmp폴더에 are9328같은 이름을 우리가 원래대로 만들어놨다는 뜻
		FileCopyUtils.copy(mpfile.getBytes(), a);
		mv.setViewName("upload/uploadResult");
		mv.addObject("savedName", savedName);
		
		return mv;
	}
	
}
