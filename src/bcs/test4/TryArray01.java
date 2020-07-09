package bcs.test4;

import java.util.ArrayList;

public class TryArray01 {

	public static void main(String[] args) {
		
		//문제1) city라는 이름의 크기 5짜리 배열을 생성하여, 
		//도시 이름으로 값을 넣어주고 (예: "서울", "도쿄", "베이징", "뉴욕", "하노이") 
		//for문과 for~each문을 각각 사용하여 배열을 출력하세요. 
		
//		String[] city = new String[5];
//		city[0] = "서울";
//		city[1] = "도쿄";
//		city[2] = "베이징";
//		city[3] = "뉴욕";
//		city[4] = "하노이";
		
		String city[] = {"서울", "도쿄", "베이징", "뉴욕", "하노이"};
		
		for(int i=0;i<city.length;i++) {
					System.out.print(city[i]+(" "));
					
//		for (String temp:city) {
//			System.out.print(temp+(" "));
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("서울"); list.add("도쿄"); list.add("베이징"); list.add("뉴욕"); list.add("하노이");
//		System.out.println(list);
		
		
					
				}
		System.out.println(city[3]);
	}//main end

}//class end
