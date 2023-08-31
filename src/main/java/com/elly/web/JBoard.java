package com.elly.web;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class JBoard {
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bno;
	
	private String btitle;
	private String bcontnet;
	private LocalDateTime bdate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mname", insertable=false, updatable=false)	
	private Member member;	
	

}
