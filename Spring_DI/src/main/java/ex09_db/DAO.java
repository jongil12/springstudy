package ex09_db;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DAO {
	// jsp ������ SqlSession ���� ����ߴ�
	// ���� ����� Ŭ���� : SqlSessionTemplate
	// jsp ���� ����� SqlSession �� ���� ����.
	
	// ���ø����� Ŭ������ �ڷ������� ���. �׷� ��Ŭ������ ����Ϸ��� ��ü�� ��������־�� �Ѵ�.
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public List<VO> getList(){
		List<VO> list = sqlSessionTemplate.selectList("members.list");
		return list;
		
	}
	
}
