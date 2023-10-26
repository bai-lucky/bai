package day06;
import java.util.Random;
import java.util.Scanner;
public class text6 {

	public static void main(String[] args) {
		// 程序生成一个随机数1-100的数字，使用程序猜出这个数字是多少
		
		//扩展三次猜不中就猜中
		int count=0;//计数作用
		
		//分析
		//1.生成一个随机数
		Random r=new Random();
		int number=r.nextInt(100)+1;
		System.out.println(number);
		//2.输入你要猜的数
		Scanner sc=new Scanner(System.in);
		
		while(true){
		System.out.println("请输入你要猜的数字：");
		int  guessnumber=sc.nextInt();
		count++;
		if(count==3){
			System.out.println("恭喜你猜中了");
			break;
		
			
		}
		//3.判断2个数给出不同的提示
		//数字打了返回大了
		//数字笑了返回笑了
		//数字相同返回一样了
		if(guessnumber>number){
			System.out.println("大了");
		}else if(guessnumber<number){
			System.out.println("小了");
		}else{
			System.out.println("恭喜你猜中了");
			break;
		}
		
		}
		
	}

}
