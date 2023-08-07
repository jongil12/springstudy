package com.ict.db;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class DAO {
	// jsp ������ SqlSession ���� ����ߴ�
	// ���� ����� Ŭ���� : SqlSessionTemplate
	// jsp ���� ����� SqlSession �� ���� ����.
	
	// ���ø����� Ŭ������ �ڷ������� ���. �׷� ��Ŭ������ ����Ϸ��� ��ü�� ��������־�� �Ѵ�.
	private SqlSessionTemplate session;

	public SqlSessionTemplate getSession() {
		return session;
	}

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}


	
}
