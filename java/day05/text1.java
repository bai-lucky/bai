package day05;
import java.util.Scanner;

public class text1 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.print("请输入今天是星期几：");
		int day=mc.nextInt();
		switch(day){
		case 1:
			System.out.print("跑步");
			break;
		case 2:
			System.out.print("游泳");
			break;
		case 3:
			System.out.print("慢走");
			break;
		case 4:
			System.out.print("动感单车");
			break;
		case 5:
			System.out.print("拳击");
			break;
		case 6:
			System.out.print("爬山");
			break;
		case 7:
			System.out.print("吃一顿");
			break;
			default:
			System.out.print("输入错误");
			break;
			//default的位置和省略
			//1.位置：default不一定要写在最下面，我们可以写在任何位置，一般写在最下面
			//2.省略;default可以省略，语法不会有问题，但是不建议这样
		
			
			/*case穿透
			      语句体中没有写break导致
			   执行流程：
			      首先会拿小括号中的表达式跟下面的每一个值进行匹配。
			      如果匹配上了，就会执行对应的语句体，如果这时候发现了break，那么结束整个switch语句。
			      如果没有发现break，那么程序会继续下一个case的语句体，一直到下一个break或者大括号为止。
			   使用场景：
			   如果有多个语句体重复了，那么我们考虑利用case穿透来简化代码。   
			*/
			
			
			/*
			 switch和if的第三种格式各自的使用场景
			 if的第三种格式：一般用于对范围的判断
			 switch：把有限个数据列举出来，然后任选其一 
			 */
			
		}

	}

}
