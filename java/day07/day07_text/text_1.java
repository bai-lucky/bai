package day07_text;

import java.util.Random;
public class text_1 {

	public static void main(String[] args) {
		//请创建一个长度为6的整数数组，并为数组中的元素赋值。
		//遍历数组，打印所有元素，元素之间用空格隔开。
		
		int[] arr=new int[6];
		for (int i = 0; i < arr.length; i++) {
			//随机生成一个数组，索引为5
			//取值范围是0-5
			Random r=new Random();
		    int a=r.nextInt(5);
		    arr[i]=a;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
