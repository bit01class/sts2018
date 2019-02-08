package com.bit.sts07.service;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bit.sts07.model.Bbs2Dao;
import com.bit.sts07.model.entity.Bbs2Vo;

@Service
public class Bbs2ServiceImpl implements Bbs2Service {
	
	@Inject
	Bbs2Dao bbs2Dao;

	@Override
	public List<Bbs2Vo> list() throws SQLException {
		return bbs2Dao.selectAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Bbs2Vo detail(int idx) throws SQLException {
		return bbs2Dao.selectOne(idx);
	}

	@Override
	public void add(Bbs2Vo bean) throws SQLException {
		bbs2Dao.insertOne(bean);
	}
	// �켱���� : Ŭ����-�޼��� > Ŭ���� > �������̽�-�޼��� > �������̽�
//	propagation - ���Ŀɼ� (�⺻�� : REQUIRED)
//	REQUIRED : �θ� Ʈ����� ������ �����ϸ� �θ� Ʈ������� ���� ��� ���ο� Ʈ������� �����մϴ�.
//	REQUIRES_NEW : �θ� Ʈ������� �����ϰ� ������ ���ο� Ʈ������� �����ǵ��� �մϴ�.
//	SUPPORT : �θ� Ʈ����� ������ �����ϸ� �θ� Ʈ������� ���� ��� nontransactionally�� ����˴ϴ�.
//	MANDATORY : �θ� Ʈ����� ������ ����Ǹ� �θ� Ʈ������� ���� ��� ���ܰ� �߻��˴ϴ�.
//	NOT_SUPPORT : nontransactionally�� �����ϸ� �θ� Ʈ����� ������ ����� ��� �Ͻ� ���� �˴ϴ�.
//	NEVER : nontransactionally�� ����Ǹ� �θ� Ʈ������� �����Ѵٸ� ���ܰ� �߻��մϴ�.
//	NESTED : �ش� �޼��尡 �θ� Ʈ����ǿ��� ����� ��� ������ Ŀ�Եǰų� �ѹ�� �� �ֽ��ϴ�. �ѷ��� Ʈ������� ���� ��� REQUIRED�� �����ϰ� �۵��մϴ�.
	@Override
	public int edit(Bbs2Vo bean) throws SQLException {
		System.out.println(bean);
		return bbs2Dao.updateOne(bean);
	}

	@Override
	public int delete(int idx) throws SQLException {
		return bbs2Dao.deleteOne(idx);
	}

}
