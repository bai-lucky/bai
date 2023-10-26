package fuzhiyunsuan;

import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		//动物园有2只老虎，体重分别通过键盘录入获取，请判断2个老虎体重是否相同
		Scanner taige=new Scanner(System.in);
		System.out.println("请输入老虎1的体重：");
		int taige1=taige.nextInt();
		System.out.println("请输入老虎2的体重：");
		int taige2=taige.nextInt();
		String resutl=taige1==taige2?"相同":"不同";
		System.out.println(resutl);
		

	}

}
