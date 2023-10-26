package day07;

public class 数组的遍历 {

	public static void main(String[] args) {
		//数组的遍历：将数组中所有的内容取出来，取出来之后可以（打印，求和，判断）
		//遍历：取出数据的过程
		
		//1.定义一个数组
		int[] arr={1,2,3,4,5};
		//获取数组里面所有的元素
		/*System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.print(arr[2]);
		System.out.print(arr[3]);
		System.out.print(arr[4]);*/
		
		//利用循环改进
		//开始条件：0
		//结束条件：最大索引  数组长度-1
		/*for(int i=0;i<=4;i++){
			//i:1,2,3,4,5
			System.out.print(arr[i]);
		}*/
		
		
		//在java中，关于一个数组的长度属性，length
		//调用方式：数组名.length
		//System.out.print(arr.length);
		for(int i=0;i<arr.length;i++){
			//i:1,2,3,4,5
			System.out.print(arr[i]);
		}
		//拓展在eclipse中使用for+alt+/ 可以快速打印数组的遍历
	

	}

}
