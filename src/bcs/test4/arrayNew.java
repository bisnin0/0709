package bcs.test4;

import java.util.Arrays;

public class arrayNew {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		
		int[] arr1 = new int[5];
		int arr2[] = new int[3];
		int arr3[] = {1,2,3};
		
		// int[4] arr4 = new int[]; ũ�⸦ �ٶ��� new �ڿ��ִ� ���ȣ �ȿ��� ����Ѵ�.
		// int[] arr5 = new int[]; ũ�⸦ �������� ������ ��������.
		
		// �ʱ�ȭ
		int[] arr6 = new int[] {2,3,4}; //ũ�⸦ ���ְ� �ٷ� ���� �������� �̷���
		// int[] arr7; arr7 = {4,5,6,7}; ũ�⸦ �����ϰ� �Ҵ��ؾ� �ϴµ� �׳� �ϸ� ��������.
		// int[] arr8 = new int[6] {1,2,3,4,5,6}; ũ�⸦ �����ϰ� �ٷ� ���� �־ ������ ����.
		// ũ��� ���� ���ÿ� �־�� �ȵȴ�.
		
		//���1) for������ <-��Ʋ����?
//		for(int i=0;i<arr6.length;i++) { // arr6 length�� 3�ΰ� �´µ� 0,1,2�� 3���⶧���� <=�� ���� �ȵȴ�.
//			System.out.println("arr6["+i+"]="arr6[i]);
//		}	
		for(int i=0 ; i<arr6.length ; i++) {
			System.out.println("arr6["+i+"]="+arr6[i]);
		}
		//���2) for each
//		for(int temp:arr6) {
//			System.out.println(temp+" ");
//		}
		
		//���3) Array.toStirng(�迭�̸�)
		System.out.println(Arrays.toString(arr6));
		
		int[] data1, data2, data3;
		int data4[], data5, data6;
		
		data4 = new int[10];
		System.out.println(data4);
		System.out.println(data4[3]);
		
		//�迭 �����ϱ�
//		data1 = new int[] {2,3,4,5,6,7,54};
//		data4 = data1;
//		System.out.println("data1:"+data1+" "+Arrays.toString(data1));
//		System.out.println("data4:"+data4+" "+Arrays.toString(data4));
//		
//		data1[4]=33;
//		System.out.println("data1:"+data1+" "+Arrays.toString(data1));
//		System.out.println("data4:"+data4+" "+Arrays.toString(data4));
		
		
	}

}
