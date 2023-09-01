package review;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동차
		// color:blue
		// size:big
		// engine: electric
		HashMap companyCar = new HashMap();
		companyCar.put("color", "blue");
		companyCar.put("size", "big");
		companyCar.put("engine", "electric");
		
		System.out.println("자동차의 속성갯수: " + companyCar.size());
		
		System.out.println("회사차의 색상은: " + companyCar.get("color"));
		System.out.println("회사차의 크기은: " + companyCar.get("size"));
		System.out.println("회사차의 엔진은: " + companyCar.get("engine"));
		
	}

}
