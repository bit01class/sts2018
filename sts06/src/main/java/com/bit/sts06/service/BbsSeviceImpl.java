package com.bit.sts06.service;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bit.sts06.model.BbsDao;
import com.bit.sts06.model.entity.BbsVo;

@Service
public class BbsSeviceImpl implements BbsService {
	@Inject
	BbsDao bbsDao;

	@Override
	public List<BbsVo> list() throws SQLException {
		return bbsDao.selectAll();
	}

	@Override
	public BbsVo detail(int num) throws SQLException {
		return bbsDao.selectOne(num);
	}

	@Override
	public void add() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public int edit(BbsVo bean) throws SQLException {
		bbsDao.cntOne(bean.getNum());
		return bbsDao.updateOne(bean);
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

}
