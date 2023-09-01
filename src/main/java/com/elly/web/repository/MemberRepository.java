package com.elly.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.elly.web.Member;


public interface MemberRepository extends Repository<Member, Long> {

	List<Member> findAll();

	void save(Member member);

	Member findByMid(String string);

	List<Member> findTop5ByOrderByMnoDesc();

	@Query(value = "SELECT count(*) FROM jmember j WHERE j.mid=?1 AND j.mpw=?2", nativeQuery = true)
	int count(String mid, String mpw);

}
