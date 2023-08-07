package com.ict.db;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class DAO {
	// jsp 에서는 SqlSession 으로 사용했다
	// 실제 사용할 클래스 : SqlSessionTemplate
	// jsp 에서 사용한 SqlSession 과 사용법 같다.
	
	// 스플링에서 클래스를 자료형으로 썼다. 그럼 이클래스를 사용하려면 객체로 만들어져있어야 한다.
	private SqlSessionTemplate session;

	public SqlSessionTemplate getSession() {
		return session;
	}

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}


	
}
