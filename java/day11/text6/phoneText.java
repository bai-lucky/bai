package text6;

import java.util.Scanner;

public class phoneText {

	public static void main(String[] args) {
		//����һ������
		phone[] arr=new phone[3];
		//����¼������
	    Scanner sc=new Scanner(System.in);
	    //�������齫���ݴ���������
	    for (int i = 0; i < arr.length; i++) {
	    	//����һ������
	    	phone p=new phone();
	    	System.out.println("�������ֻ���Ʒ�ƣ�");
	    	//����¼��,��brand������
	    	String brand=sc.next();
	    	//���ö������set������������¼���ֵ
	    	 p.setBrand(brand);
	    	 //¼��۸�
	    	 System.out.println("�������ֻ��ļ۸�");
	    	 double price=sc.nextDouble();
	    	 p.setPrice(price);
	    	 //¼����ɫ
	    	 System.out.println("�������ֻ�����ɫ");
	    	 String color=sc.next();
	    	 p.setColor(color);
	    	 //��p����������ݴ���������
	    	 arr[i]=p;
	    	 
		}
	    double sum=0;
	    for (int i = 0; i < arr.length; i++) {
			phone Phone=arr[i];
			sum=sum+Phone.getPrice();
		}
	    //��ƽ��ֵ
	    //�����ܲ�д���Ͳ�д��
	    double avg=sum/arr.length;
	    System.out.println(avg);

	}

}
