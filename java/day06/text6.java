package day06;
import java.util.Random;
import java.util.Scanner;
public class text6 {

	public static void main(String[] args) {
		// ��������һ�������1-100�����֣�ʹ�ó���³���������Ƕ���
		
		//��չ���β²��оͲ���
		int count=0;//��������
		
		//����
		//1.����һ�������
		Random r=new Random();
		int number=r.nextInt(100)+1;
		System.out.println(number);
		//2.������Ҫ�µ���
		Scanner sc=new Scanner(System.in);
		
		while(true){
		System.out.println("��������Ҫ�µ����֣�");
		int  guessnumber=sc.nextInt();
		count++;
		if(count==3){
			System.out.println("��ϲ�������");
			break;
		
			
		}
		//3.�ж�2����������ͬ����ʾ
		//���ִ��˷��ش���
		//����Ц�˷���Ц��
		//������ͬ����һ����
		if(guessnumber>number){
			System.out.println("����");
		}else if(guessnumber<number){
			System.out.println("С��");
		}else{
			System.out.println("��ϲ�������");
			break;
		}
		
		}
		
	}

}
