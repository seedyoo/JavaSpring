package review;

import java.io.*;

public class FileStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String file_path = "d:\\temp\\javatext.txt";
		
		// InputStream is = null;
		FileInputStream fis = null;	// InputStream 클래스 상속받은 클래스
		
		try {
			File file = new File(file_path);
			fis = new FileInputStream(file);	// 바이트 단위로 읽음
			
			int ch;
			while( ( ch=fis.read() ) != -1) {	// -1 이 아니면 데이터 존재
				System.out.print((char)ch);
			}
			fis.close();
		}catch(FileNotFoundException e) {
			System.out.println("지정 파일이 없습니다");
		}catch(IOException ie) {
			System.out.println("알 수 없는 입출력입니다");
		}
		
		
	}

}
