package test;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a = 정수
		// b = 정수
		// 두수의 합을 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("정수 b를 입력하세요.");
		int b = sc.nextInt();
		int sum = ( a + b );
		System.out.println("a + b 의 합:" + sum);
		
		sc.close();
	}

}
