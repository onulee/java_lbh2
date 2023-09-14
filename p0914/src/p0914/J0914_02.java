package p0914;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J0914_02 {

	public static void main(String[] args) {
		Date d = new Date();  //객체선언
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy-MM-dd hh시mm분ss초");
		System.out.println(sdf3.format(d));
		
		//Calendar c = new Calendar(); //에러 객체선언
		Calendar cal = Calendar.getInstance(); // 싱글톤 패턴
		System.out.println(sdf.format(cal.getTime()));

	}

}
