package day05;
import java.util.Scanner;
public class text7 {

	public static void main(String[] args) {
		// 键盘录入2个数，表示一个范围。
		//统计在这个范围内既能被3整除又能被5整除的数有多少个
		Scanner ms=new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int a=ms.nextInt();
		System.out.println("请输入第二个数字：");
		int b=ms.nextInt();
		int count=0;
		
		
		for(int i=a;i<=b;i++){
			if(i%3==0 &&  i%5==0){
				count++;
			}
			
		}
		System.out.println(count);
	}
		

	}


