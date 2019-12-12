package com.cafe24.dusthgks.test3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.dusthgks.test3.service.MemberService;

@Controller
public class MemberController {

	@Autowired private MemberService memberService; 
	
	//회원리스트
	@GetMapping("/memberList")
	public String memberList(Model model) {
		
		model.addAttribute("memberList", memberService.getMemberList());
		
		return "member/memberList";
	}
	
	
	
}
