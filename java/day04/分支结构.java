package fenzhijiegou;

import java.util.Scanner;
public class 分支结构 {

	public static void main(String[] args) {
		//需求：键盘录入女婿酒量，如果大于2斤，老丈人给出回应，反之不回应
         
		//if格式
		//if（）{
		//语句体：
	//    }
		  
		Scanner mc=new Scanner(System.in);
		System.out.println("请输入女婿的酒量：");
		int nx=mc.nextInt();
		if(nx>2){
		System.out.println("好好好很不错");
		//if注意点
		//1.大括号的开头可以另起一行书写，但是建议写在第一行末尾
		//2.在语句体中，如果只有一段代码，大括号可以省略不写
		//3.如果对一个boolean类型变量进行判断，不要用==号，直接把变量写在小括号中
		}
	}

}
