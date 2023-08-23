package test;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// str = 문자입력
		// num = 숫자입력
		// 숫자만큼 문자열을 출력하시오
		Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요: ");
        String Str = sc.nextLine();
        

        System.out.print("출력할 횟수를 입력하세요: ");
        int num = sc.nextInt();
        
        // 입력 받은 숫자만큼 문자열 출력
        for (int i = 0; i < num; i++) {
            System.out.println(Str);
        }
        
        sc.close();
	}

}
