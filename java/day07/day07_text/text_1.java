package day07_text;

import java.util.Random;
public class text_1 {

	public static void main(String[] args) {
		//�봴��һ������Ϊ6���������飬��Ϊ�����е�Ԫ�ظ�ֵ��
		//�������飬��ӡ����Ԫ�أ�Ԫ��֮���ÿո������
		
		int[] arr=new int[6];
		for (int i = 0; i < arr.length; i++) {
			//�������һ�����飬����Ϊ5
			//ȡֵ��Χ��0-5
			Random r=new Random();
		    int a=r.nextInt(5);
		    arr[i]=a;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
