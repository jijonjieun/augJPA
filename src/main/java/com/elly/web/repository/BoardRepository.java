package com.elly.web.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.elly.web.JBoard;

public interface BoardRepository extends Repository<JBoard, Long> {

	void save(JBoard jBoard);

	List<JBoard> findAll();

}
