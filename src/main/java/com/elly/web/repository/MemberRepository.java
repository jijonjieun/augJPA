package com.elly.web.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.elly.web.Member;


public interface MemberRepository extends Repository<Member, Long> {

	List<Member> findAll();

	void save(Member member);

	List<Member> findTop5ByOrderByMnoDesc();
	

}
