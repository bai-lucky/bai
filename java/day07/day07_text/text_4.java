package day07_text;

public class text_4 {

	public static void main(String[] args) {
		//现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，
		//从数组的最大索引位置开始到最小索引位置
		//依次表示整数的个位、十位、百位。。。依次类推。
		//请编写程序计算，这个数组所表示的整数值。
		int[] arr={2,6,7,8,4,3};
		int number=0;
		for (int i =arr.length-1; i>=0; i--) {
			 number=arr[i]+number*10;
			 
		}
          System.out.println(number);


	}

}
