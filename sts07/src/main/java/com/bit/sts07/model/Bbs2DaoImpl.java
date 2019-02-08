package com.bit.sts07.model;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.bit.sts07.model.entity.Bbs2Vo;
import com.ibatis.sqlmap.client.SqlMapClient;

@Repository
public class Bbs2DaoImpl implements Bbs2Dao {
	@Inject
	SqlMapClient sqlMapClient;

	@Override
	public List<Bbs2Vo> selectAll() throws SQLException {
		return sqlMapClient.queryForList("selectAll");
	}

	@Override
	public Bbs2Vo selectOne(int idx) throws SQLException {
		return (Bbs2Vo) sqlMapClient.queryForObject("selectOne",idx);
	}

	@Override
	public void insertOne(Bbs2Vo bean) throws SQLException {
		sqlMapClient.insert("insertOne",bean);
	}

	@Override
	public int updateOne(Bbs2Vo bean) throws SQLException {
		return sqlMapClient.update("updateOne", bean);
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		return sqlMapClient.delete("deleteOne", idx);
	}

}
