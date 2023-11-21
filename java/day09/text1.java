package day09;
import java.util.Scanner;

public class text1 {

	public static void main(String[] args) {
		//需求:机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
       //按照如下规则计算机票价格：旺季（5-10月）头等舱9折，
		//经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
		
		//1.键盘录入原价 月份 什么仓
		//2.判断是几月份对应相对打折
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入机票的原价");
		int ticket=sc.nextInt();//ticket 票
		System.out.println("请输入当前的月份");
		int month=sc.nextInt();//month 月
		System.out.println("请输入当前购买的舱位 0头等舱 1经济舱");
		int seat=sc.nextInt();//seat 座位
		if(month>=5 &&month<=10){
			if(seat==0){
				ticket=(int)(ticket*0.9);//强制转换
			}else if(seat==1){
				ticket=(int)(ticket*0.85);
			}else{
				System.out.println("没有这个舱位");
			}
		}else if((month>=1 && month<=4) || (month>=11 && month<=12)){
			if(seat==0){
				//头等舱
				ticket=(int)(ticket*0.7);//强制转换
			}else if(seat==1){
				//经济舱
				ticket=(int)(ticket*0.65);
			}else{
				System.out.println("没有这个舱位");
			}
		}else{
			System.out.println("键盘录入月份不合法");
		}
		System.out.println(ticket);
		
	}

}
