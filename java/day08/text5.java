package day08;

public class text5 {

	public static void main(String[] args) {
		//定义一个方法，求每一个季度的营业额。
		//根据方法的结果计算出全年的营业额
		
		//直接调用
		yingYe(300,400,500);
		//赋值调用
		int sum=yingYe(300,400,500)*4;
		System.out.println(sum);
		//输出调用
		System.out.println(yingYe(300,400,500));

	}
	public static int yingYe(int moth1,int moth2,int moth3){
		int result=moth1+moth2+moth3;
		return result;
	}

}
