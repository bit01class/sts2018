package com.bit.sts04.model;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bit.sts04.model.entity.Bbs06Vo;

public class Bbs06DaoImpl implements Bbs06Dao {
	Logger log=LoggerFactory.getLogger(this.getClass());

	@Override
	public List<Bbs06Vo> selectAll() throws SQLException {
		log.debug("selectAll run...");
		return null;
	}

	@Override
	public Bbs06Vo selectOne(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOne(Bbs06Vo bean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int updateOne(Bbs06Vo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCnt(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
