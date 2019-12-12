package com.cafe24.dusthgks.test3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.dusthgks.test3.mapper.MemberMapper;
import com.cafe24.dusthgks.test3.vo.Member;

@Service
public class MemberService {
	
	@Autowired 
	private MemberMapper memberMapper;
	
	//회원리스트
	public List<Member> getMemberList(){
		List<Member> list = memberMapper.getMemberList();
		System.out.println(list.toString());
		return memberMapper.getMemberList();
	}
	

}
