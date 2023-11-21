package text4;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		//键盘录入
		//nextInt(); 接收整数
		//nextDouble();接收小数
		//next();接收字符串
		//遇到空格，制表符，回车就停止接收，这些符号后面的就不会接收了
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num1=sc.nextInt();// 123 123  剩下的一个123会被后面的输出
		System.out.println(num1);//123
		System.out.println("请输入二个整数");
		int num2=sc.nextInt();
		System.out.println(num2);*/
		
		
		
		//第二个体系
		//nextLine();
		//可以接收空格，制表符，遇到回车才停止接收数据
		Scanner ls=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line1=ls.nextLine();
		System.out.println(line1);
		System.out.println("请输入二个字符串");
		String line2=ls.nextLine();
		System.out.println(line2);
		

		//键盘录入两套体系不能混用
		//弊端：先使用nextInt()会导致下面的nextLine()接收不到数据
	}

}
