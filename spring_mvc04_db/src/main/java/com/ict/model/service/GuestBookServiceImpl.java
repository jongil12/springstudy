package com.ict.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ict.model.dao.GuestBookDAO;
import com.ict.model.vo.GuestBookVO;

@Controller
public class GuestBookServiceImpl implements GuestBookService{

	// DAO 에가서 DB 처리 결과를 받아 오자
	@Autowired
	private GuestBookDAO guestBookDAO;
	
	

	@Override
	public List<GuestBookVO> getGuestBookList() {
		return guestBookDAO.getGuestBookList();
	}

	@Override
	public GuestBookVO getGuestBookOneList(String m_idx) {
		
		return guestBookDAO.getGuestBookOneList(m_idx);
	}

	@Override
	public int getGuestBookInsert(GuestBookVO gvo2) {
	
		return guestBookDAO.getGuestBookInsert(gvo2);
	}

	@Override
	public int getGuestBookUpdate(GuestBookVO gvo2) {
		
		return guestBookDAO.getGuestBookUpdate(gvo2);
	}

	@Override
	public int getGuestBookDelete(String m_idx) {
		return guestBookDAO.getGuestBookDelete(m_idx);
	}

}
