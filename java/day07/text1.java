package day07;

public class text1 {

	public static void main(String[] args) {
		// ����һ�����飬�洢1,2,3,4,5,
		//�����õ�ÿһ��Ԫ�أ������������������ݵĺ�
		int[] all={1,2,3,4,5,};
		int sum=0;
		for (int i = 0; i < all.length; i++) {
			//i��ʾ���������ÿһ������
			//all[i]��ʾ�����ÿһ��Ԫ��
			sum=sum+all[i];
			System.out.print(i);
		}
		System.out.print(sum);

	}

}
