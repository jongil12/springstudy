package ex04_DI;

import java.util.Calendar;

public class Age {
	public int count(String jumin, int gender) {
		int result = 0;
		// gender �� 1 �Ǵ� 2 �̸� 1900 �⿡ �¾
		// gender �� 3 �Ǵ� 4 �̸� 2000 �⿡ �¾
		
		// ���� �⵵ - �¾ �⵵ = ����
		int cYear = Calendar.getInstance().get(Calendar.YEAR);
		int bYear = 0;
		if (gender == 1 || gender == 2) {
			bYear = 1900 + Integer.parseInt(jumin.substring(0, 2));
		}else if(gender == 3 || gender == 4){
			bYear = 2000 + Integer.parseInt(jumin.substring(0, 2));
		}
		result = cYear - bYear;
		return result;
	}
}
