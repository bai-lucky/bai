package day09;

import java.util.Random;

public class text7 {

	public static void main(String[] args) {
		//һ����Vֱ���齱����Ʒ���ֽ������ֱ���{2, 588 , 888, 1000, 10000}�������
		//��ʹ�ô���ģ��齱����ӡ��ÿ���������ĳ���˳��Ҫ����Ҳ��ظ���
		//��ӡЧ�����£������˳�򣬲�һ���������˳��

		
		//����һ�������ʾ����
		int[] arr={2,588,888,1000,10000};
		//2.����������洢��ȡ�Ľ��
		int[] newArr=new int[arr.length];
		//3.�齱
		Random r=new Random();
		//��Ϊ�������������Ҫ��5��
		for (int i = 0; i < 5;) {
			//��ȡ�������
			int randomIndex=r.nextInt(arr.length);
			//��ȡ����
			int prize=arr[randomIndex];
			//�жϵ�ǰ�Ľ����Ƿ����
			boolean flag=contains(newArr,prize);
			if(!flag){
				//�ѵ�ǰ�鵽�Ľ�����ӵ�newArr�С�
				newArr[i]=prize;
				//�����Ϻ��ƶ�����
				i++;
			}
		}
		//����newArr
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);	
		}
	}
	//�ж�prize���������Ƿ����
	//������� true
	//���������false
	public static boolean contains(int[] arr,int prize){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==prize){
				return true;
			}
		}
		return false;
	}

}
