package fenzhijiegou;

import java.util.Scanner;
public class text2 {

	public static void main(String[] args) {
		/* 键盘录入一个整数，表示身上的钱
         如果大于100就吃网红餐厅，否则就吃沙县小吃
          */
		Scanner ms=new Scanner(System.in);
		System.out.println("请输入有多少钱：");
		int a=ms.nextInt();
		if(a>100){
			System.out.println("去吃网红餐厅");
		}
			else{
				System.out.println("去吃沙县小吃");
			
		}
	}

}
