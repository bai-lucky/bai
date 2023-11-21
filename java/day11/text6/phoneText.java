package text6;

import java.util.Scanner;

public class phoneText {

	public static void main(String[] args) {
		//创建一个数组
		phone[] arr=new phone[3];
		//键盘录入内容
	    Scanner sc=new Scanner(System.in);
	    //遍历数组将内容存入数组中
	    for (int i = 0; i < arr.length; i++) {
	    	//创建一个对象
	    	phone p=new phone();
	    	System.out.println("请输入手机的品牌：");
	    	//键盘录入,用brand来接收
	    	String brand=sc.next();
	    	//利用对象调用set方法，用来存录入的值
	    	 p.setBrand(brand);
	    	 //录入价格
	    	 System.out.println("请输入手机的价格");
	    	 double price=sc.nextDouble();
	    	 p.setPrice(price);
	    	 //录入颜色
	    	 System.out.println("请输入手机的颜色");
	    	 String color=sc.next();
	    	 p.setColor(color);
	    	 //把p这个对象内容存入数组中
	    	 arr[i]=p;
	    	 
		}
	    double sum=0;
	    for (int i = 0; i < arr.length; i++) {
			phone Phone=arr[i];
			sum=sum+Phone.getPrice();
		}
	    //求平均值
	    //数据能不写死就不写死
	    double avg=sum/arr.length;
	    System.out.println(avg);

	}

}
