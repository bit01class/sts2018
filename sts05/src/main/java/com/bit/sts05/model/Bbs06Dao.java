package com.bit.sts05.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.sts05.model.entity.Bbs06Vo;

public interface Bbs06Dao {

	List<Bbs06Vo> selectAll() throws SQLException;
	Bbs06Vo selectOne(int idx) throws SQLException;
	void insertOne(Bbs06Vo bean) throws SQLException;
	int updateOne(Bbs06Vo bean) throws SQLException;
	int deleteOne(int idx) throws SQLException;
}
