package fenzhijiegou;

import java.util.Scanner;
public class text2 {

	public static void main(String[] args) {
		/* ����¼��һ����������ʾ���ϵ�Ǯ
         �������100�ͳ��������������ͳ�ɳ��С��
          */
		Scanner ms=new Scanner(System.in);
		System.out.println("�������ж���Ǯ��");
		int a=ms.nextInt();
		if(a>100){
			System.out.println("ȥ���������");
		}
			else{
				System.out.println("ȥ��ɳ��С��");
			
		}
	}

}
