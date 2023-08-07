package ex05_Annotation;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sic")
public class Service {
	
	@Autowired	// 변수이름과 참되는 클래스의 아이디가 같을 때 사용
//	@Inject		// 변수이름과 참되는 클래스의 아이디가 같을 때 사용
	// 변수이름과 참되는 클래스의 아이디가 다를때 사용
	@Qualifier("mySQLDAO")
	//방법2 
		//클래스 자료형으로 활용
		private DAO dao;
		public Service() {}
		
		//생성자를 이용해서 dao 주입
		public Service(DAO dao) {
			this.dao = dao;
		}

		// setter 를 이용하는 방법
		public void setDao(DAO dao) {
			this.dao = dao;
		}

		public DAO getDao() {
			return dao;
		}
		 // 방법2 실제 실행하고자 하는 메서드
		 public void biz() {
			  dao.prn();
		// 생성자나 세터에의해서 결정됨 결정된것으로 prn을 만든다
		// 생성자를 자료형으로 사용한다.(그러러면 전역변수로 만든다)
		 }
}
