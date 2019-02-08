package com.bit.sts07.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bit.sts07.model.entity.Bbs2Vo;

public interface Bbs2Service {

	List<Bbs2Vo> list() throws SQLException;
	Bbs2Vo detail(int idx) throws SQLException;
	void add(Bbs2Vo bean) throws SQLException;
	int edit(Bbs2Vo bean) throws SQLException;
	int delete(int idx) throws SQLException;
}
