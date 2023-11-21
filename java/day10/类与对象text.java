package day10;

public class 类与对象text {

	public static void main(String[] args) {
		//创建手机的对象
		类和对象 p=new 类和对象();
		//给手机赋值
		p.brand="小米";
		p.price=1999.98;
		
		//获取手机中对象的值
		System.out.println(p.brand);
		System.out.println(p.price);
		
		//调用手机的方法
		p.call();
		p.playGame();

	}

}
