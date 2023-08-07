package com.ict.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ict.model.vo.MembersVO;

@Repository
public class MembersDAO {
	// ���� Mapper�� ȣ���ϴ� Ŭ����
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;


	// members ����Ʈ
	public List<MembersVO> membersList(){
		List<MembersVO> list = sqlSessionTemplate.selectList("members.list");
		return list;
	}
	
	// member ����
	public int memberAdd(MembersVO mvo) {
		int result = sqlSessionTemplate.insert("members.insert", mvo);
		return result;
				
	}		
}
