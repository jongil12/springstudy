package com.ict.model.service;

import java.util.List;

import com.ict.model.vo.GuestBookVO;
import com.ict.model.vo.GuestBookVO2;


public interface GuestBookService2 {
	
	// ��ü����
	List<GuestBookVO2>  getGuestBook2List();
	
	// ����
	int getGuestBook2Insert(GuestBookVO2 gvo2);
	
	// �󼼺���
	GuestBookVO2 getGuestBook2OneList(String m_idx);
	
	// ����
	int getGuestBook2Delete(String m_idx);

	// ����
	int getGuestBook2Update(GuestBookVO2 gvo2);
	
}
