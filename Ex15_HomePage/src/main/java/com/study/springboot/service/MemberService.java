package com.study.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
@Autowired
MemberRepository memberRepository;

public boolean idCheck(String id) {
	return memberRepository.existsById(id); // id가 존재하는지 알려줌 존재하면 true 존재하지않을시 false
}

}
