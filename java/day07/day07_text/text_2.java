package day07_text;

public class text_2 {

	public static void main(String[] args) {
		// 现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。
		//请编写代码，找出数组中的最小值并打印。
		double[] arr={12.9, 53.54, 75.0, 99.1, 3.14};
		double min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min){
				min=arr[i];
			}	
		}
        System.out.print("数组中的最小值为："+min);
	}

}
