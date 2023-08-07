package com.ict.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.model.vo.GuestBookVO2;


@Repository
public class GuestBookDAO2 {
	// 실제 Mapper를 호출하는 클래스
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	// 서비스에서 DB 처리하는 메서드를 모두 받아 줘야 한다.
	// Guestbook 리스트(한줄로 줄일수 있다. 2줄은 membersDAO 참조)
	public List<GuestBookVO2> getGuestBook2List(){
		return sqlSessionTemplate.selectList("guestbook2.list");
		
	}
	
	// Guestbook 삽입
	public int getGuestBook2Insert(GuestBookVO2 gvo2) {
		return sqlSessionTemplate.insert("guestbook2.insert", gvo2);
		
				
	}
	
	// 상세보기
	public 	GuestBookVO2	getGuestBook2OneList(String m_idx) {
		return sqlSessionTemplate.selectOne("guestbook2.onelist", m_idx);
	}
	
	// 삭제
	public int getGuestBook2Delete(String m_idx) {
		return sqlSessionTemplate.delete("guestbook2.delete", m_idx);
	}
	
	// 수정
	public int getGuestBook2Update(GuestBookVO2 gvo2) {
		return sqlSessionTemplate.update("guestbook2.update", gvo2);
	}
}
