package day07;

public class text1 {

	public static void main(String[] args) {
		// 定义一个数组，存储1,2,3,4,5,
		//遍历得到每一个元素，求数组里面所有数据的和
		int[] all={1,2,3,4,5,};
		int sum=0;
		for (int i = 0; i < all.length; i++) {
			//i表示数组里面的每一个索引
			//all[i]表示数组的每一个元素
			sum=sum+all[i];
			System.out.print(i);
		}
		System.out.print(sum);

	}

}
