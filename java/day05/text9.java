package day05;

public class text9 {

	public static void main(String[] args) {
		//����2���������������ͳ����������������Ҷ�������int��Χ��
		//�������������Ҫ��ʹ�ó˷���������%��������õ��̺�������

		int a=69;//������
		int b=2;//����
		int count=0;//���Ĵ���
		while(a>=b){
			a=a-b;
			count++;
		}
		System.out.print("����Ϊ��"+a);
		System.out.print("��Ϊ��"+count);
	}

}
