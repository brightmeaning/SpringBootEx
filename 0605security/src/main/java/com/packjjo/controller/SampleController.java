package com.packjjo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {
	
	@GetMapping("sample1")
	public void sample1() {	
	}
	@GetMapping("/")
	public String index() {

		log.info("index");
		return "index";
	}

	@RequestMapping("/guest")
	public void forGuest() {

		log.info("guest");

	}

	@RequestMapping("/manager")
	public void forManager() {

		log.info("manager");

	}

	@RequestMapping("/admin")
	public void forAdmin() {

		log.info("admin");

	}
}
