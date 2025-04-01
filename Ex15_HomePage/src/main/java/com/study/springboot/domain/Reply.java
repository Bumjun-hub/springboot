package com.study.springboot.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Reply {
	@Id
	@SequenceGenerator(name = "ReplySEQ", sequenceName = "Reply_SEQ", allocationSize = 1)
	@GeneratedValue(generator = "ReplySEQ")

	@NonNull
	@Column(name = "ref_bno")
	private Long refBno;

	@NonNull
	private String writer;

	private String title;
	@NonNull
	private String content;

	@CreatedDate
	@Column(name = "create_date")
	private LocalDateTime createDate;

	@LastModifiedDate
	@Column(name = "update_date")
	private LocalDateTime updateDate;

}
