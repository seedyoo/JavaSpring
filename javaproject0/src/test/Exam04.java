package test;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예를 들어 AbCdEf 처럽 입력하면
		// aBcDeF 로 변환해서 출력하시오
		Scanner sc = new Scanner(System.in);

        System.out.print("영어 문자열을 입력하세요: ");
        String Str = sc.nextLine();

        String reversedString = reverseCase(Str);
        System.out.println("변환된 문자열: " + reversedString);

        sc.close();
		
	}
	
	public static String reverseCase(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

}
