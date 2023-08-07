package com.ict.model.service;

import java.util.List;

import com.ict.model.vo.GuestBookVO;
import com.ict.model.vo.GuestBookVO2;


public interface GuestBookService2 {
	
	// 전체보기
	List<GuestBookVO2>  getGuestBook2List();
	
	// 삽입
	int getGuestBook2Insert(GuestBookVO2 gvo2);
	
	// 상세보기
	GuestBookVO2 getGuestBook2OneList(String m_idx);
	
	// 삭제
	int getGuestBook2Delete(String m_idx);

	// 수정
	int getGuestBook2Update(GuestBookVO2 gvo2);
	
}
