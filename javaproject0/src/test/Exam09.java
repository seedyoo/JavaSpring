package test;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100사이의 임의의 숫자를 입력해서
		// 홀수인지 짝수인지 출력하고 범위를 넘으면
		// 다시 입력받아서 처리하기
		Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("1~100 사이의 숫자를 입력하세요. ");
            n = sc.nextInt();

            if (n < 1 || n > 100) {
                System.out.println("범위를 벗어난 숫자입니다. 다시 입력해주세요.");
            } 
            else {
                if (n % 2 == 0) {
                    System.out.println(n + "는(은) 짝수입니다.");
                } 
                else if(n % 2 == 1) {
                    System.out.println(n + "는(은) 홀수입니다.");
                }
            }
        }
        while (n < 1 || n > 100);
        sc.close();
	}

}
