package fuzhiyunsuan;

import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
		//数字6是一个伟大的数字，键盘录入2个数字。
		//如果一个其中为6，最终结果输出true。
		//如果他们的和为6的倍数，输出true，其他都是false
		Scanner nb=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=nb.nextInt();
		System.out.println("请输入第二个数：");
		int b=nb.nextInt();
		boolean result=a==6||b==6||(a+b)%6==0;
		System.out.println(result);
	}

}
