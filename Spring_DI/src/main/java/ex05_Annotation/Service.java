package ex05_Annotation;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sic")
public class Service {
	
	@Autowired	// �����̸��� ���Ǵ� Ŭ������ ���̵� ���� �� ���
//	@Inject		// �����̸��� ���Ǵ� Ŭ������ ���̵� ���� �� ���
	// �����̸��� ���Ǵ� Ŭ������ ���̵� �ٸ��� ���
	@Qualifier("mySQLDAO")
	//���2 
		//Ŭ���� �ڷ������� Ȱ��
		private DAO dao;
		public Service() {}
		
		//�����ڸ� �̿��ؼ� dao ����
		public Service(DAO dao) {
			this.dao = dao;
		}

		// setter �� �̿��ϴ� ���
		public void setDao(DAO dao) {
			this.dao = dao;
		}

		public DAO getDao() {
			return dao;
		}
		 // ���2 ���� �����ϰ��� �ϴ� �޼���
		 public void biz() {
			  dao.prn();
		// �����ڳ� ���Ϳ����ؼ� ������ �����Ȱ����� prn�� �����
		// �����ڸ� �ڷ������� ����Ѵ�.(�׷����� ���������� �����)
		 }
}
