package com.kkuk.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/gallery")
public class GalleryController {


	@RequestMapping(value = "/join")
	public String join() {
		return "gallery/join";
	}

	@RequestMapping(value = "/list")
	public String list() {
		return "gallery/list";
	}

	@RequestMapping(value = "/view")
	public String view() {
		return "gallery/view";
	}
}
