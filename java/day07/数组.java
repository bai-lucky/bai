package day07;

public class 数组 {

	public static void main(String[] args) {
		// 格式
		// 1. 数据类型【】 数组名  一般使用第一个
		//2.  数据类型 数组名【】
		//初始化格式：  数据类型 【】 数组名={元素1，元素2，....}
		//初始化 为数组内存开辟空间，并将数据存入容器的过程
		
		
		//需求：定义数组存储5个学生的年龄
		int[] arr1={18,17,16,15,14,13};
		//2.定义数组储存三个学生的名字
		String[] arr2={"张三","李四","王五"};
		//3.定义一个数组存储4个学生的身高
		double[] arr3={194.5,172,175.6,181};
		System.out.println(arr3);// [D@15db9742<-地址值：数组在内存中的位置
		
		
		//扩展：
		//解释地址值的格式含义
		//[D@15db9742
		//[：表示是一个数组
		//D：表数组的元素都是double类型
		//@；表示一个间隔符号。固定格式
		//15db9742；这才是数组真正的地址值。（16进制）
		//平时我们习惯叫这个整体叫地址值

		

	}

}
