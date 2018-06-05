package com.packjjo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.packjjo.persistence.TimeMapper;

@Controller
public class TimeController {
	
	@Autowired
	private TimeMapper timeMapper;
	
	@GetMapping("/time")
	public void getTime(Model model) {
		model.addAttribute("now", timeMapper.getTimeXML());
		
	}
}
