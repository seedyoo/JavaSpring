package test;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		// 문자를 입력받아서
		// 세로 방향으로 출력하기
		// 입력: 가나다라마
		// 출력: 
		// 가
		// 나
		// 다
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
		sc.close();

	}

}
