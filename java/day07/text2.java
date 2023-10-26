package day07;

public class text2 {

	public static void main(String[] args) {
		// 定义一个数组，存储1,2,3,4,5,6,7,8,9,10
		//遍历得到每一个元素，统计数组里面一共有多少个能被3整除的数
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int count=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]%3==0){
				count++;
			}
		}
		System.out.print("数组中能被3整除的数字有"+count+"个");

	}

}
