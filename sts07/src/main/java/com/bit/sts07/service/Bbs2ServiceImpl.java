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
	// 우선순위 : 클래스-메서드 > 클래스 > 인터페이스-메서드 > 인터페이스
//	propagation - 전파옵션 (기본값 : REQUIRED)
//	REQUIRED : 부모 트랜잭션 내에서 실행하며 부모 트랜잭션이 없을 경우 새로운 트랜잭션을 생성합니다.
//	REQUIRES_NEW : 부모 트랜잭션을 무시하고 무조건 새로운 트랜잭션이 생성되도록 합니다.
//	SUPPORT : 부모 트랜잭션 내에서 실행하며 부모 트랜잭션이 없을 경우 nontransactionally로 실행됩니다.
//	MANDATORY : 부모 트랜잭션 내에서 실행되며 부모 트랜잭션이 없을 경우 예외가 발생됩니다.
//	NOT_SUPPORT : nontransactionally로 실행하며 부모 트랜잭션 내에서 실행될 경우 일시 정지 됩니다.
//	NEVER : nontransactionally로 실행되며 부모 트랜잭션이 존재한다면 예외가 발생합니다.
//	NESTED : 해당 메서드가 부모 트랜잭션에서 진행될 경우 별개로 커밋되거나 롤백될 수 있습니다. 둘러싼 트랜잭션이 없을 경우 REQUIRED와 동일하게 작동합니다.
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
