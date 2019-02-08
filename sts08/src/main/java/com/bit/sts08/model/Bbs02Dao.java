package com.bit.sts08.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.sts08.model.entity.Bbs02Vo;

public interface Bbs02Dao {

	List<Bbs02Vo> selectAll() throws SQLException;
	Bbs02Vo selectOne(int idx) throws SQLException;
	void insertOne(Bbs02Vo bean) throws SQLException;
	int updateOne(Bbs02Vo bean) throws SQLException;
	int deleteOne(int idx) throws SQLException;
}
