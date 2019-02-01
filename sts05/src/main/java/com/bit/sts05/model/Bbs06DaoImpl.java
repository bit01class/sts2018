package com.bit.sts05.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.bit.sts05.model.entity.Bbs06Vo;

@Component("bbs06Dao")
public class Bbs06DaoImpl implements Bbs06Dao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	PlatformTransactionManager transactionManager;
	
	private RowMapper<Bbs06Vo> rowMapper=new RowMapper<Bbs06Vo>() {
		
		@Override
		public Bbs06Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Bbs06Vo(
					rs.getInt("bbs_num"),rs.getString("name"),
					rs.getString("sub"),rs.getInt("cnt")
					);
		}
	};

	@Override
	public List<Bbs06Vo> selectAll() throws SQLException {
		String sql="select bbs_num, nvl((select name from user06 where user_num=A.user_num),'비회원') as name,"
				+ " sub, cnt from bbs06 A order by bbs_num desc";
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Bbs06Vo selectOne(final int idx) throws SQLException {
		final String sql="select bbs_num, nvl((select name from user06 where user_num=A.user_num),'비회원') as name,"
				+ " sub,content, cnt from bbs06 A where bbs_num=?";
		final String sql2="update bbs06 set cnt=cnt+1 where bbs_num=?";
		Bbs06Vo bean=null;
		TransactionDefinition definition=new DefaultTransactionDefinition();
		TransactionStatus status=transactionManager.getTransaction(definition);
		try {
			jdbcTemplate.update(new PreparedStatementCreator() {
				
				@Override
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
					PreparedStatement pstmt = conn.prepareStatement(sql2);
					pstmt.setInt(1, idx);
					return pstmt;
				}
			});
			bean=jdbcTemplate.query(new PreparedStatementCreator() {
				
				@Override
				public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
					PreparedStatement pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, idx);
					return pstmt;
				}
			}, rowMapper).get(0);
			transactionManager.commit(status);
		}catch (Exception e) {
			transactionManager.rollback(status);
		}
		
		
		return bean;
	}

	@Override
	public void insertOne(Bbs06Vo bean) throws SQLException {
		
		String sql="insert into bbs06 values (bbs06_seq.nextval,?,?,?,0)";
		jdbcTemplate.update(sql, new Object[] {bean.getUser_num(),bean.getSub(),bean.getContent()});
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

}
