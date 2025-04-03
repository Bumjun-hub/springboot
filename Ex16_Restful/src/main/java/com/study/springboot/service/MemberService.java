package com.study.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	MemberRepository memberRepository;

	public boolean idCheck(String id) {
		return memberRepository.existsById(id); // id가 존재하는지 알려줌 존재하면 true 존재하지않을시 false
	}

	public Member insert(Member member) {

		return memberRepository.save(member);
	}

	public Member login(Member member) {

		Optional<Member> loginUser = memberRepository.findById(member.getId());
		if (loginUser.isPresent()) {
			return loginUser.get();
		} else {
			return null;
		}
	
	}

}
