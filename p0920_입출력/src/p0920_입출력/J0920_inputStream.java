package p0920_입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class J0920_inputStream {

	public static void main(String[] args) {
		
		// 파일을 읽어올때 사용
		
		// byte 배열단위로 가져옴.
		byte[] b = new byte[1024];
		try {
			FileInputStream fis = new FileInputStream("c:/aaa/11.txt");
			fis.read(b); //파일 읽어오기
			System.out.println(new String(b));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("파일을 읽어 왔습니다.");
		
		
		// 1byte단위로 가져옴.
//		try {
//			FileInputStream fis = new FileInputStream("c:/aaa/11.txt");
//			int read = 0;
//			while((read=fis.read()) != -1) { // 읽은 파일이 있으면
//				System.out.print((char)read);  //byte단위 -> 한글지원이 안됨.
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
