package com.ict.bbs.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.bbs.model.dao.BBS_DAO;
import com.ict.bbs.model.vo.BBS_VO;
@Service
public class BBS_ServiceImpl implements BBS_Service {
	@Autowired
	private BBS_DAO bBS_DAO;
	@Override
	public List<BBS_VO> getList() {
		
		return bBS_DAO.getList();
	}
	
	@Override
	public int getInsert(BBS_VO bvo) {
		// TODO Auto-generated method stub
		return bBS_DAO.getInsert(bvo);
	}

	@Override
	public BBS_VO getOneList(String b_idx) {
		
		return bBS_DAO.getOneList(b_idx);
	}

	@Override
	public int getHitUpdate(String b_idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
