package day09;
import java.util.Scanner;

public class text1 {

	public static void main(String[] args) {
		//����:��Ʊ�۸��յ���������ͷ�Ȳպ;��ò��շѡ������Ʊԭ�ۡ��·ݺ�ͷ�Ȳջ򾭼òա�
       //�������¹�������Ʊ�۸�������5-10�£�ͷ�Ȳ�9�ۣ�
		//���ò�8.5�ۣ�������11�µ�����4�£�ͷ�Ȳ�7�ۣ����ò�6.5�ۡ�
		
		//1.����¼��ԭ�� �·� ʲô��
		//2.�ж��Ǽ��·ݶ�Ӧ��Դ���
		Scanner sc=new Scanner(System.in);
		System.out.println("�������Ʊ��ԭ��");
		int ticket=sc.nextInt();//ticket Ʊ
		System.out.println("�����뵱ǰ���·�");
		int month=sc.nextInt();//month ��
		System.out.println("�����뵱ǰ����Ĳ�λ 0ͷ�Ȳ� 1���ò�");
		int seat=sc.nextInt();//seat ��λ
		if(month>=5 &&month<=10){
			if(seat==0){
				ticket=(int)(ticket*0.9);//ǿ��ת��
			}else if(seat==1){
				ticket=(int)(ticket*0.85);
			}else{
				System.out.println("û�������λ");
			}
		}else if((month>=1 && month<=4) || (month>=11 && month<=12)){
			if(seat==0){
				//ͷ�Ȳ�
				ticket=(int)(ticket*0.7);//ǿ��ת��
			}else if(seat==1){
				//���ò�
				ticket=(int)(ticket*0.65);
			}else{
				System.out.println("û�������λ");
			}
		}else{
			System.out.println("����¼���·ݲ��Ϸ�");
		}
		System.out.println(ticket);
		
	}

}
