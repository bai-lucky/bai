package day09;

public class text4 {

	public static void main(String[] args) {
		//��һ�������Ԫ�ظ��Ƶ���һ��������ȥ
		//1.����һ������
		int[] arr={1,2,3,4,5};
		//2.����һ��������
		int[] newarr=new int[arr.length];
		//3.���������飬�õ��������е�ÿһ��Ԫ�أ�Ȼ�󸳵�����������ȥ
		for (int i = 0; i < arr.length; i++) {
			//i �����������
			//arr[i] �������е�ÿһ��Ԫ��
			newarr[i]=arr[i];
			
		}
		//4.���������Ԫ��
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i]);
		}

	}

}
