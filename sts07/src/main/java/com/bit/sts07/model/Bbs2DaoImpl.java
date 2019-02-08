package com.bit.sts07.model;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.bit.sts07.model.entity.Bbs2Vo;

@Repository
public class Bbs2DaoImpl implements Bbs2Dao {
	@Inject
	SqlSession session;

	@Override
	public List<Bbs2Vo> selectAll() throws SQLException {
		return session.selectList("bbs.selectAll");
	}

	@Override
	public Bbs2Vo selectOne(int idx) throws SQLException {
		return session.selectOne("bbs.selectOne",idx);
	}

	@Override
	public void insertOne(Bbs2Vo bean) throws SQLException {
		session.insert("bbs.insertOne",bean);
	}

	@Override
	public int updateOne(Bbs2Vo bean) throws SQLException {
		return session.update("bbs.updateOne", bean);
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		return session.delete("bbs.deleteOne", idx);
	}
	
///////////////////////  ibatis //////////////////////////////////////	
//	@Inject
//	SqlMapClient sqlMapClient;
//
//	@Override
//	public List<Bbs2Vo> selectAll() throws SQLException {
//		return sqlMapClient.queryForList("selectAll");
//	}
//
//	@Override
//	public Bbs2Vo selectOne(int idx) throws SQLException {
//		return (Bbs2Vo) sqlMapClient.queryForObject("selectOne",idx);
//	}
//
//	@Override
//	public void insertOne(Bbs2Vo bean) throws SQLException {
//		sqlMapClient.insert("insertOne",bean);
//	}
//
//	@Override
//	public int updateOne(Bbs2Vo bean) throws SQLException {
//		return sqlMapClient.update("updateOne", bean);
//	}
//
//	@Override
//	public int deleteOne(int idx) throws SQLException {
//		return sqlMapClient.delete("deleteOne", idx);
//	}

}
