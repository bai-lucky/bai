package day06;
import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		//键盘录入一个数判断是不是质数。

		Scanner nb=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int i=nb.nextInt();
		
		
		//定义一个变量来表示标记
		//表示i是否为一个质数
		//true 是一个质数
		//false 不是一个质数
		
		boolean flag=true;
		//表示最开始认为是一个质数
		for(int a=2;a<=i-1;a++){
			if(i%a==0){
				flag=false;
				//System.out.println("不是一个质数");
				break;
			}
		}
		if(flag){
			System.out.println(i+"是一个质数");
		}else{
			System.out.println(i+"不是一个质数");
		}
	}

}
