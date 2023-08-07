package com.ict.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.model.vo.GuestBookVO2;


@Repository
public class GuestBookDAO2 {
	// ���� Mapper�� ȣ���ϴ� Ŭ����
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	// ���񽺿��� DB ó���ϴ� �޼��带 ��� �޾� ��� �Ѵ�.
	// Guestbook ����Ʈ(���ٷ� ���ϼ� �ִ�. 2���� membersDAO ����)
	public List<GuestBookVO2> getGuestBook2List(){
		return sqlSessionTemplate.selectList("guestbook2.list");
		
	}
	
	// Guestbook ����
	public int getGuestBook2Insert(GuestBookVO2 gvo2) {
		return sqlSessionTemplate.insert("guestbook2.insert", gvo2);
		
				
	}
	
	// �󼼺���
	public 	GuestBookVO2	getGuestBook2OneList(String m_idx) {
		return sqlSessionTemplate.selectOne("guestbook2.onelist", m_idx);
	}
	
	// ����
	public int getGuestBook2Delete(String m_idx) {
		return sqlSessionTemplate.delete("guestbook2.delete", m_idx);
	}
	
	// ����
	public int getGuestBook2Update(GuestBookVO2 gvo2) {
		return sqlSessionTemplate.update("guestbook2.update", gvo2);
	}
}