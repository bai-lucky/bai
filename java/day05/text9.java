package day05;

public class text9 {

	public static void main(String[] args) {
		//给定2个整数，被除数和除数（都是正数，且都不超过int范围）
		//将两个数相除，要求不使用乘法，除法和%运算符。得到商和余数。

		int a=69;//被除数
		int b=2;//除数
		int count=0;//减的次数
		while(a>=b){
			a=a-b;
			count++;
		}
		System.out.print("余数为："+a);
		System.out.print("商为："+count);
	}

}
