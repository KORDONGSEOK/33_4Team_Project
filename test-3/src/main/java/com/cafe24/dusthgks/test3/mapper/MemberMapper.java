package com.cafe24.dusthgks.test3.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.dusthgks.test3.vo.Member;

@Mapper
public interface MemberMapper {

	// 전체 회원 리스트 조회
	public List<Member> getMemberList();
}
