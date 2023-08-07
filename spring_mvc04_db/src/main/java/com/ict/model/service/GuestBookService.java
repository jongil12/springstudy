package com.ict.model.service;

import java.util.List;

import com.ict.model.vo.GuestBookVO;


public interface GuestBookService {
	
	// ��ü����
	List<GuestBookVO>  getGuestBookList();
	
	// �󼼺���
	GuestBookVO getGuestBookOneList(String m_idx);
	// ����
	int getGuestBookInsert(GuestBookVO gvo);
	
	
	// ����
	int getGuestBookUpdate(GuestBookVO gvo);
	
	// ����
	int getGuestBookDelete(String m_idx);
}