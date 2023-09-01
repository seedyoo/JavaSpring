package review;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		
		// 사과 오렌지 멜론 수박 : 과일명의 정보들이 있다 가정
		ArrayList fruit = new ArrayList();
		
		fruit.add("사과");
		fruit.add("오렌지");
		fruit.add("멜론");
		fruit.add("수박");
		
		System.out.println("fruit 의 총갯수: " + fruit.size());
		
		for(int i=0; i<fruit.size(); i++) {
			System.out.println("인덱스번호: " + i + ", 과일명: " + fruit.get(i));
		}
	}
	
}
