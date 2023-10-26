package day07;

public class 数组的动态初始化 {

	public static void main(String[] args) {
		//动态初始化：初始化时只能指定数组的长度，由系统为数组分配初始值
		//格式：数据类型[] 数据名=new 数据类型[数组的长度]
		
		
		//定义一个数组，用来存储班级中50个学生的姓名
		//姓名未知，学生报道之后在添加
		
		
		//创建的时候，由自己定义数组的长度，由虚拟机定义初始化值
		String[] arr=new String[50];
		//添加学生
		arr[0]="张三";
		arr[1]="李四";
		//打印初始化
		System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.print(arr[2]);
		
		//数组默认初始化值的规律
		//整数类型：默认初始化值为0
		//小数类型；默认初始化值为0.0
		//字符类型；默认初始化值为’/u0000‘ 空格
		//布尔数据类型；默认初始化值为false
		//引用数据类型；默认初始化值为null

	}

}
