package exam1;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity // 데이터베이스랑 직접적으로 연결되는 클래스
@Table(name="JpaMember1") // 테이블 이름
public class Member1 {
	
	@Id
	@GeneratedValue // 시퀀스 자동생성
	private Long id; // int일시 값이 없을때 0이 들어감, Long(객체)일땐 NULL이 들어옴 
	private String username;
	
	/*
	@Temporal(TemporalType.TIMESTAMP)
	private Date date1;
	*/
	
	@Column(name="create_date")
	private LocalDate createDate;

	// 빈 생성자는 반드시 있어야됨
	public Member1() {
		
	}
	
	public Member1( String username, LocalDate createDate) {
		
		this.username = username;
		this.createDate = createDate;
	}
	 
	
	// @Entity : 해당 클래스가 JPA의 엔티티임을 의미(테이블 매칭된 JPA)
	// @Table(name = "이름") : 실제 db에 생성될 테이블 이름
	//	  					  만약, 이 어노테이션이 없으면 클래스의 이름이 테이블 이름이 됨
	// @id = 
	// @GeneratedValue : sequence를 이용함
	
	
	

}
