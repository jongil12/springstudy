package com.ict.bbs.model.service;

import java.util.List;

import com.ict.bbs.model.vo.BBS_VO;

public interface BBS_Service {
	// ����Ʈ
	public List<BBS_VO> getList();
	//�󼼺���
	public BBS_VO getOneList(String b_idx);
	// ��ȸ�� ������Ʈ
	public int getHitUpdate(String b_idx);
	// ����
	public int getInsert(BBS_VO bvo);
}
