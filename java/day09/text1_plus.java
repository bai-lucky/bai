package day09;

import java.util.Scanner;

public class text1_plus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入机票的原价");
		int ticket=sc.nextInt();//ticket 票
		System.out.println("请输入当前的月份");
		int month=sc.nextInt();//month 月
		System.out.println("请输入当前购买的舱位 0头等舱 1经济舱");
		int seat=sc.nextInt();//seat 座位
		if(month>=5 &&month<=10){
			getPrice(ticket,seat,0.9,0.85);
		}else if((month>=1 && month<=4) || (month>=11 && month<=12)){
			getPrice(ticket,seat,0.7,0.65);
		}else{
			System.out.println("键盘录入月份不合法");
		}
		System.out.println(ticket);

	}
	public static int getPrice(int ticket,int seat,double v0,double v1){
		if(seat==0){
			//头等舱
			ticket=(int)(ticket*v0);//强制转换
		}else if(seat==1){
			//经济舱
			ticket=(int)(ticket*v1);
		}else{
			System.out.println("没有这个舱位");
		}
		return ticket;
	}

}
