package com.ict.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.model.vo.GuestBookVO;


@Repository
public class GuestBookDAO {
	// ���� Mapper�� ȣ���ϴ� Ŭ����
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	// ���񽺿��� DB ó���ϴ� �޼��带 ��� �޾� ��� �Ѵ�.
	// Guestbook ����Ʈ(���ٷ� ���ϼ� �ִ�. 2���� membersDAO ����)
	public List<GuestBookVO> getGuestBookList(){
		return sqlSessionTemplate.selectList("guestbook.list");
		
	}
	
	// Guestbook ����
	public int getGuestBookInsert(GuestBookVO gvo) {
		return sqlSessionTemplate.insert("guestbook.insert", gvo);
		
				
	}
	
	// �󼼺���
	public 	GuestBookVO	getGuestBookOneList(String m_idx) {
		return sqlSessionTemplate.selectOne("guestbook.onelist", m_idx);
	}
	
	// ����
	public int getGuestBookDelete(String m_idx) {
		return sqlSessionTemplate.delete("guestbook.delete", m_idx);
	}
	
	// ����
	public int getGuestBookUpdate(GuestBookVO gvo) {
		return sqlSessionTemplate.update("guestbook.update", gvo);
	}
}