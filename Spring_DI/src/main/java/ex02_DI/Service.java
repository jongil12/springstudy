package ex02_DI;


public class Service {
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