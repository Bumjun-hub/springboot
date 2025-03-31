
package com.study.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	MemberRepository memberRepository;

	public Member insert(Member member) {
		// save() : jpa에서 insert메소드
		// 동일한키가 있으면 update, 키가 없으면 insert

		Member result = memberRepository.save(member);
		return result;
	}

	public Optional<Member> select(Long id) {
		return memberRepository.findById(id);
	}

	public List<Member> selectAll() {
		return memberRepository.findAll();
	}

	public void insert() {
		Member member;
		member = new Member("더조은", "test1@test.com");
		memberRepository.save(member);

		member = new Member("이조은", "test2@test.com");
		memberRepository.save(member);

		member = new Member("김조은", "test3@test.com");
		memberRepository.save(member);

		member = new Member("박조은", "test4@test.com");
		memberRepository.save(member);

		member = new Member("최조은", "test5@test.com");
		memberRepository.save(member);

		member = new Member("강조은", "test7@test.com");
		memberRepository.save(member);

		member = new Member("양조은", "test8@test.com");
		memberRepository.save(member);
	}

	public Optional<Member> selectByName(String name) {
		return memberRepository.findByName(name);
	}

	public List<Member> selectByNameLikeSort(String name2, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Member> selectByNameLikeNameDesc(String name2) {
		return memberRepository.findBynameLikeOrderByNameDesc(name2);
	}

	public List<Member> selectByNameLike(String name2) {
		return memberRepository.findByNameLike(name2);
	}

	public Optional<Member> selectByEmail(String email) {
		return memberRepository.findByEmail(email);
	}

	/*
	 * jpa 메소드 삭제시 : deleteById(id) 업데이트시 : save(member)
	 */

}
