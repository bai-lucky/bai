package fenzhijiegou;
import java.util.Scanner;
public class text3 {

	public static void main(String[] args) {
		// 

		Scanner sc=new Scanner(System.in);
		System.out.println("请输入有多少钱：");
		int money=sc.nextInt();
		if(money>600){
			System.out.println("付款成功");
		}
			else{
				System.out.println("付款失败");
			
		}
	}

}
