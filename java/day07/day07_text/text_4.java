package day07_text;

public class text_4 {

	public static void main(String[] args) {
		//����һ���������飬�����е�ÿ��Ԫ�ض���[0-9]֮������֣�
		//��������������λ�ÿ�ʼ����С����λ��
		//���α�ʾ�����ĸ�λ��ʮλ����λ�������������ơ�
		//���д������㣬�����������ʾ������ֵ��
		int[] arr={2,6,7,8,4,3};
		int number=0;
		for (int i =arr.length-1; i>=0; i--) {
			 number=arr[i]+number*10;
			 
		}
          System.out.println(number);


	}

}
