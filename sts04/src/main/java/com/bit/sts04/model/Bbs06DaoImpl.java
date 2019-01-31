package com.bit.sts04.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bit.sts04.model.entity.Bbs06Vo;

public class Bbs06DaoImpl implements Bbs06Dao {
	Logger log=LoggerFactory.getLogger(this.getClass());
	DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Bbs06Vo> selectAll() throws SQLException {
		String sql="select bbs_num,(select name from user06 where user_num=A.user_num) as name,sub,content,cnt from bbs06 A";
		List<Bbs06Vo> list=new ArrayList<Bbs06Vo>();
		log.debug("selectAll run...");
		try(Connection conn=dataSource.getConnection()){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())list.add(new Bbs06Vo(
					rs.getInt("bbs_num"),rs.getString("name"),rs.getString("sub"),
					rs.getString("content"),rs.getInt("cnt")
					));
			pstmt.close();
			rs.close();
		}
		return list;
	}

	@Override
	public Bbs06Vo selectOne(int idx) throws SQLException {
		String sql="select bbs_num,user_num,"
				+ "(select name from user06 where user_num=A.user_num) as name,"
				+ "sub,content,cnt from bbs06 A where bbs_num=?";
		try(Connection conn=dataSource.getConnection()){
			conn.setAutoCommit(false);
			updateCnt(idx);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			ResultSet rs = pstmt.executeQuery();
			if(!rs.next())return null;
			Bbs06Vo bean =new Bbs06Vo(
					rs.getInt("bbs_num"),rs.getString("name"),rs.getString("sub"),
					rs.getString("content"),rs.getInt("cnt")
					);
			bean.setUser_num(rs.getInt("user_num"));
			conn.commit();
			rs.close();
			pstmt.close();
			
			return bean;
		}
	}

	@Override
	public void insertOne(Bbs06Vo bean) throws SQLException {
		String sql="insert into bbs06 values (bbs06_seq.nextval,?,?,?,0)";
		try(Connection conn=dataSource.getConnection()){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bean.getUser_num());
			pstmt.setString(2, bean.getSub());
			pstmt.setString(3, bean.getContent());
			pstmt.executeUpdate();
			pstmt.close();
		}
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
		String sql="UPDATE BBS06 SET CNT=CNT+1 WHERE BBS_NUM=?";
		return 0;
	}

}






















