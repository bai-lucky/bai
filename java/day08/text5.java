package day08;

public class text5 {

	public static void main(String[] args) {
		//����һ����������ÿһ�����ȵ�Ӫҵ�
		//���ݷ����Ľ�������ȫ���Ӫҵ��
		
		//ֱ�ӵ���
		yingYe(300,400,500);
		//��ֵ����
		int sum=yingYe(300,400,500)*4;
		System.out.println(sum);
		//�������
		System.out.println(yingYe(300,400,500));

	}
	public static int yingYe(int moth1,int moth2,int moth3){
		int result=moth1+moth2+moth3;
		return result;
	}

}
