
package fuzhiyunsuan;

import java.util.Scanner;
public class text1 {

	public static void main(String[] args) {
		//键盘录入2个数，表示你和你对象约会时的时髦程度。（手动录入0-10之间的数，不能录入其他）
		//如果你的时髦程度大于你对象的时髦程度，则相亲成功，输出true，否则输出false。

		//1.键盘录入我们的时髦度
		Scanner mc=new Scanner(System.in);
		System.out.println("请输入你的时髦程度");
		int my=mc.nextInt();
		System.out.println("请输入你对象时髦程度");
		int she=mc.nextInt();
		
		//2.把我们的时髦度进行对比
		boolean result=my>she;//result作用是存储表示返回值
		//3.打印结果
	    System.out.print(result);
				
	}

}
