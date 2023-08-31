package com.elly.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;


@Entity
@Data
@Table(name = "jmember")
public class Member {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mno;
	
	@Column(length = 10)
	private String mname;
	
	@Column(name="mid" , unique = true)
	private String mid;
	
	private String mpw;
	
	@Column(columnDefinition = "TIMESTAMP")
	private String mjoindate;
	
	
	private String m_addr;
	private String m_birth;
	private String m_mbti;
}
