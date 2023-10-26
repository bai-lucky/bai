package day06;
import java.util.Scanner;
public class text2 {

	public static void main(String[] args) {
		//键盘录入一个大于等于2的整数x,并返回x的算数平方根。
		//结果只保留整数部分，小数被舍弃
		Scanner ms=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a=ms.nextInt();
		for(int i=1;i<=a;i++){
			if(i*i==a){
				System.out.println(i+"就是"+a+"的平方根");
				break;//一旦找到就停止循环，后面就不用进行
			}else if(i*i>a){
				System.out.println((i-1)+"就是"+a+"的平方根");
				break;
			}
		}
	}

}
