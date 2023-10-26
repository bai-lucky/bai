package day07;

public class 数组的索引 {

	public static void main(String[] args) {
		//利用索引对数组的元素进行访问
		//1.获取数组里面的元素
		//格式；数组名[索引]
		
		int[] arr1={1,2,3,4};
		//获取第一个元素
		//其实就是0索引上的对应元素
		int number=arr1[0];
		System.out.print(number);
		//获取数组中1索引上对应的元素并打印
		System.out.print(arr1[1]);
		
		//2.把数据存储到数组中
		//格式：数组名[索引]=具体的数据//变量；
		//细节：一旦覆盖原来的就不在了
		arr1[0]=100;
		System.out.print(arr1[0]);//100
	}

}
