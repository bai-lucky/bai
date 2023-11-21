package text5;

import java.util.Scanner;

public class CarText {

	public static void main(String[] args) {
		//1.定义一个数组
		Car[] arr=new Car[3];
		//创建汽车对象，数据来源于键盘录入
		Scanner sr=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			//创建汽车的对象,一定要写在循环里面
			Car c=new Car();
			//录入品牌
			System.out.println("请录入品牌：");
			String brand=sr.next();
			c.setBrand(brand);
			//录入价格
			System.out.println("请录入价格：");
			int price=sr.nextInt();
			c.setPrice(price);
			//录入颜色
			System.out.println("请录入颜色：");
			String color=sr.next();
			c.setBrand(color);
			//现在把汽车对象添加到数组中
			arr[i]=c;
			
		}
		for (int i = 0; i < arr.length; i++) {
			Car car=arr[i];
			System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
		}

	}

}
