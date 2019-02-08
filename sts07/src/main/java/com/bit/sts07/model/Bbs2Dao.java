package com.bit.sts07.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.sts07.model.entity.Bbs2Vo;

public interface Bbs2Dao {
	
	List<Bbs2Vo> selectAll() throws SQLException;
	Bbs2Vo selectOne(int idx) throws SQLException;
	void insertOne(Bbs2Vo bean) throws SQLException;
	int updateOne(Bbs2Vo bean) throws SQLException;
	int deleteOne(int idx) throws SQLException;
}
