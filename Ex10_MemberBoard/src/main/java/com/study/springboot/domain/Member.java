
package com.study.springboot.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Member1")
@EntityListeners(AuditingEntityListener.class)
public class Member {
	@Id
	@GeneratedValue
	private String id;

	private String name;

	private String password;

	@CreatedDate
	@Column(name = "created_at")
	private LocalDateTime createdAt;

}
