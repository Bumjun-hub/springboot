
package com.study.springboot.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.study.springboot.domain.Member;

/*
 * JPQL (Java Persistence Query Language)
 * - JPA의 Query Methods 만으로 조회가 불가능 할 때
 
 * nativeQuery
 * - 직접 SQL문을 사용하는 방식
 */

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

	@Query("select m from jpapaging m where m.name like :name1 order by m.id desc")
	// from 뒤에는 Member 클래스에 있는 Entity name을 써줌. 무조건 대문자로
	// 별칭을 이용하여 가져올 컬럼과 조건 등에 넣는다.
	List<Member> findMembers(@Param("name1") String name);

	@Query("select m from jpapaging m where m.name like :n1")
	List<Member> findMembers(@Param("n1") String name2, Sort sort);
	
	@Query("select m from jpapaging m where m.name like :search")
	Page<Member> findMembers(@Param("search") String name, Pageable pageable);
	
	// 일반 sql문
	@Query(value="select * from jpapaging where name like :name1 order by id desc",
			nativeQuery = true)
	List<Member> findMembersNative(@Param("name1")String name);
	
}
