package com.bit.sts06.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bit.sts06.model.entity.BbsVo;

@Repository
public class BBsDaoImpl implements BbsDao {
	Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Inject
	JdbcTemplate jdbcTemplate;
	
	private RowMapper<BbsVo> rowMapper=new RowMapper<BbsVo>() {
		
		@Override
		public BbsVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new BbsVo(
					rs.getInt("num"),rs.getString("sub"),rs.getString("content"),
					rs.getDate("nalja"),rs.getInt("cnt")
					);
		}
	};

	@Override
	public List<BbsVo> selectAll() throws SQLException {
		log.debug("dao selectAll()...");
		String sql="SELECT * FROM BBS ORDER BY NUM DESC";
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public BbsVo selectOne(int idx) throws SQLException {
		String sql="SELECT * FROM BBS WHERE NUM=?";
		return jdbcTemplate.queryForObject(sql, rowMapper,idx);
	}

	@Override
	public void insertOne(BbsVo bean) throws SQLException {
		String sql="INSERT INTO BBS (SUB,CONTENT,NALJA,CNT) VALUES (?,?,NOW(),0)";
		jdbcTemplate.update(sql, bean.getSub(),bean.getContent());
	}

	@Override
	public int updateOne(BbsVo bean) throws SQLException {
		String sql="UPDATE BBS SET SUB=?,CONTENT=? WHERE NUM=?";
		return jdbcTemplate.update(sql, bean.getSub(),
									bean.getContent(),bean.getNum());
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		String sql="DELETE FROM BBS WHERE NUM=?";
		return jdbcTemplate.update(sql, idx);
	}

	@Override
	public int cntOne(int idx) throws SQLException {
		String sql="UPDATE BBS2 SET CNT=CNT+1 WHERE NUM=?";
		return jdbcTemplate.update(sql, idx);
	}

}
