package fuzhiyunsuan;

import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
		//����6��һ��ΰ������֣�����¼��2�����֡�
		//���һ������Ϊ6�����ս�����true��
		//������ǵĺ�Ϊ6�ı��������true����������false
		Scanner nb=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=nb.nextInt();
		System.out.println("������ڶ�������");
		int b=nb.nextInt();
		boolean result=a==6||b==6||(a+b)%6==0;
		System.out.println(result);
	}

}
