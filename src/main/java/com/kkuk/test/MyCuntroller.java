package com.kkuk.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCuntroller {

	@RequestMapping(value = "/index")
	public String index() {
		return "index"; // 실제 실행 될 서버에 있는 jsp 파일의 이름(확장제 제외(.jsp))
	}
	
	@RequestMapping(value = "/boardList")
	public String boardList() {
		return "boardList"; // 실제 실행 될 서버에 있는 jsp 파일의 이름(확장제 제외(.jsp))
	}
	
	@RequestMapping(value = "/joinMember")
	public String joinMember() {
		return "member/joinMember"; // 실제 실행 될 서버에 있는 jsp 파일의 이름(확장제 제외(.jsp))
		//실제 실행될서버에 있는 폴더이름/jsp 파일의 이름 까지
	}
	
}
