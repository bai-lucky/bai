package day09;

import java.util.Scanner;

public class text1_plus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������Ʊ��ԭ��");
		int ticket=sc.nextInt();//ticket Ʊ
		System.out.println("�����뵱ǰ���·�");
		int month=sc.nextInt();//month ��
		System.out.println("�����뵱ǰ����Ĳ�λ 0ͷ�Ȳ� 1���ò�");
		int seat=sc.nextInt();//seat ��λ
		if(month>=5 &&month<=10){
			getPrice(ticket,seat,0.9,0.85);
		}else if((month>=1 && month<=4) || (month>=11 && month<=12)){
			getPrice(ticket,seat,0.7,0.65);
		}else{
			System.out.println("����¼���·ݲ��Ϸ�");
		}
		System.out.println(ticket);

	}
	public static int getPrice(int ticket,int seat,double v0,double v1){
		if(seat==0){
			//ͷ�Ȳ�
			ticket=(int)(ticket*v0);//ǿ��ת��
		}else if(seat==1){
			//���ò�
			ticket=(int)(ticket*v1);
		}else{
			System.out.println("û�������λ");
		}
		return ticket;
	}

}
