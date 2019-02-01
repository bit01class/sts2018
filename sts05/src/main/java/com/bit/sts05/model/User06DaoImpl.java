package com.bit.sts05.model;

import java.sql.SQLException;

import com.bit.sts05.model.entity.User06Vo;

public class User06DaoImpl implements User06Dao {

	@Override
	public User06Vo login(String id, String pw) throws SQLException {
		return new User06Vo(0, id, pw, "tester");
	}

}
