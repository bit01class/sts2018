package com.bit.sts06.model;

import java.sql.SQLException;
import java.util.List;

import com.bit.sts06.model.entity.BbsVo;

public interface BbsDao {

	List<BbsVo> selectAll() throws SQLException;
	BbsVo selectOne(int idx) throws SQLException;
	void insertOne(BbsVo bean) throws SQLException;
	int updateOne(BbsVo bean) throws SQLException;
	int deleteOne(int idx) throws SQLException;
	int cntOne(int idx) throws SQLException;
}














