package com.bit.sts05.model;

import java.sql.SQLException;

import com.bit.sts05.model.entity.User06Vo;

public interface User06Dao {
	
	User06Vo login(User06Vo bean) throws SQLException;
	
}
