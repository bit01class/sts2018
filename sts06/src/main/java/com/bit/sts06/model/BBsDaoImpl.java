package com.bit.sts06.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.bit.sts06.model.entity.BbsVo;

@Component
public class BBsDaoImpl implements BbsDao {
	Logger log=LoggerFactory.getLogger(this.getClass());
	
	//@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertOne(BbsVo bean) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int updateOne(BbsVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cntOne(int idx) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
