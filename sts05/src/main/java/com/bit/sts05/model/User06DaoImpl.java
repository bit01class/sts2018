package com.bit.sts05.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bit.sts05.model.entity.User06Vo;

public class User06DaoImpl implements User06Dao {
	JdbcTemplate jdbcTemplate;
	
	public User06DaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	private RowMapper rowMapper=new RowMapper<User06Vo>() {

		@Override
		public User06Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new User06Vo(
					rs.getInt("user_num"),rs.getString("id"),null,rs.getString("name")
					);
		}
	};

	@Override
	public User06Vo login(User06Vo bean) throws SQLException {
		String sql="select user_num,id,name from user06 where id=? and pw=?";
		return jdbcTemplate.queryForObject(sql,new Object[] {bean.getId(),bean.getPw()}, rowMapper);
	}

}
