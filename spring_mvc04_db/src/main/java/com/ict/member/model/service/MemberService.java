package com.ict.member.model.service;

import com.ict.member.model.vo.MemberVO;

public interface MemberService {
	// ȸ�� ����
	int getMemberAdd(MemberVO m2vo);
	
	// �α���
	// 1.id �� �н����� �´��� �˻�
	MemberVO getMemberPwd(String m_id);
	
	// ���̵� ã��
	
	
	// ��й�ȣ ã�� 
}
