package bcs.test4;

import java.util.Arrays;

public class arrayNew {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		
		int[] arr1 = new int[5];
		int arr2[] = new int[3];
		int arr3[] = {1,2,3};
		
		// int[4] arr4 = new int[]; 크기를 줄때는 new 뒤에있는 대괄호 안에다 줘야한다.
		// int[] arr5 = new int[]; 크기를 지정하지 않으면 에러난다.
		
		// 초기화
		int[] arr6 = new int[] {2,3,4}; //크기를 안주고 바로 값을 넣으려면 이렇게
		// int[] arr7; arr7 = {4,5,6,7}; 크기를 지정하고 할당해야 하는데 그냥 하면 에러난다.
		// int[] arr8 = new int[6] {1,2,3,4,5,6}; 크기를 지정하고 바로 값을 넣어도 에러가 난다.
		// 크기와 값을 동시에 넣어서는 안된다.
		
		//출력1) for문으로 <-왜틀렸지?
//		for(int i=0;i<arr6.length;i++) { // arr6 length가 3인건 맞는데 0,1,2로 3개기때문에 <=를 쓰면 안된다.
//			System.out.println("arr6["+i+"]="arr6[i]);
//		}	
		for(int i=0 ; i<arr6.length ; i++) {
			System.out.println("arr6["+i+"]="+arr6[i]);
		}
		//출력2) for each
//		for(int temp:arr6) {
//			System.out.println(temp+" ");
//		}
		
		//출력3) Array.toStirng(배열이름)
		System.out.println(Arrays.toString(arr6));
		
		int[] data1, data2, data3;
		int data4[], data5, data6;
		
		data4 = new int[10];
		System.out.println(data4);
		System.out.println(data4[3]);
		
		//배열 복사하기
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
