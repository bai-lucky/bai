package day07;

public class text3 {

	public static void main(String[] args) {
		//����һ�����飬�洢1,2,3,4,5,6,7,8,9,10
		//�����õ�ÿһ��Ԫ��
		//1.����������ͽ���ǰ����������2��
		//2.�����ż������С������֮һ
		int[] all={1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < all.length; i++) {
			if(all[i]%2==0){
				all[i]=all[i]/2;
			}else{
				all[i]=2*all[i];
			}
			
		}
		//һ��ѭ������ֻ��һ������
		for (int i = 0; i < all.length; i++) {
			System.out.print(all[i]);
		}

	}

}
