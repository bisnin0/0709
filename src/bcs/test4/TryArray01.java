package bcs.test4;

import java.util.ArrayList;

public class TryArray01 {

	public static void main(String[] args) {
		
		//����1) city��� �̸��� ũ�� 5¥�� �迭�� �����Ͽ�, 
		//���� �̸����� ���� �־��ְ� (��: "����", "����", "����¡", "����", "�ϳ���") 
		//for���� for~each���� ���� ����Ͽ� �迭�� ����ϼ���. 
		
//		String[] city = new String[5];
//		city[0] = "����";
//		city[1] = "����";
//		city[2] = "����¡";
//		city[3] = "����";
//		city[4] = "�ϳ���";
		
		String city[] = {"����", "����", "����¡", "����", "�ϳ���"};
		
		for(int i=0;i<city.length;i++) {
					System.out.print(city[i]+(" "));
					
//		for (String temp:city) {
//			System.out.print(temp+(" "));
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("����"); list.add("����"); list.add("����¡"); list.add("����"); list.add("�ϳ���");
//		System.out.println(list);
		
		
					
				}
		System.out.println(city[3]);
	}//main end

}//class end
