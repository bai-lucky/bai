package day06;
import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		//����¼��һ�����ж��ǲ���������

		Scanner nb=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int i=nb.nextInt();
		
		
		//����һ����������ʾ���
		//��ʾi�Ƿ�Ϊһ������
		//true ��һ������
		//false ����һ������
		
		boolean flag=true;
		//��ʾ�ʼ��Ϊ��һ������
		for(int a=2;a<=i-1;a++){
			if(i%a==0){
				flag=false;
				//System.out.println("����һ������");
				break;
			}
		}
		if(flag){
			System.out.println(i+"��һ������");
		}else{
			System.out.println(i+"����һ������");
		}
	}

}
