
package com.study.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.springboot.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

	Optional<Member> findByName(String name);
	Optional<Member> findByEmail(String name);
	
	List<Member> findByNameLike(String name2);
	List<Member> findBynameLikeOrderByNameDesc(String name2);

}
