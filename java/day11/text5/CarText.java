package text5;

import java.util.Scanner;

public class CarText {

	public static void main(String[] args) {
		//1.����һ������
		Car[] arr=new Car[3];
		//������������������Դ�ڼ���¼��
		Scanner sr=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			//���������Ķ���,һ��Ҫд��ѭ������
			Car c=new Car();
			//¼��Ʒ��
			System.out.println("��¼��Ʒ�ƣ�");
			String brand=sr.next();
			c.setBrand(brand);
			//¼��۸�
			System.out.println("��¼��۸�");
			int price=sr.nextInt();
			c.setPrice(price);
			//¼����ɫ
			System.out.println("��¼����ɫ��");
			String color=sr.next();
			c.setBrand(color);
			//���ڰ�����������ӵ�������
			arr[i]=c;
			
		}
		for (int i = 0; i < arr.length; i++) {
			Car car=arr[i];
			System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
		}

	}

}
