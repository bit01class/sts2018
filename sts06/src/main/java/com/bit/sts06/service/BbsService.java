package com.bit.sts06.service;

import java.sql.SQLException;
import java.util.List;

import com.bit.sts06.model.entity.BbsVo;

public interface BbsService {

	List<BbsVo> list() throws SQLException;
	BbsVo detail(int num) throws SQLException;
	void add() throws SQLException;
	int edit(BbsVo bean) throws SQLException;
	int delete() throws SQLException;
}
