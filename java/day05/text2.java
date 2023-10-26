package day05;
import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
		// 键盘录入星期数，输出工作日、休息日
		//1-5工作日，6-7休息日
		Scanner mc=new Scanner(System.in);
		System.out.println("请输入今天是星期几");
		int week=mc.nextInt();
		switch(week){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("工作日");
			break;
		case 6:
		case 7:
			System.out.println("休息日");
			default:
				System.out.println("没有这个数字");
				break;
		
		}
	}

}
