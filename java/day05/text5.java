package day05;

public class text5 {

	public static void main(String[] args) {
		//1.��1-100�ĺ�
		int sum=0;
		int i=1;
		for(i=1;i<=100;i++){
			//��͵ı������ܶ�����ѭ�����棬��Ϊ����ֻ�������Ĵ���������Ч
			//������ǰѱ���������ѭ�����棬��ô��ǰ����ֻ�ڱ���ѭ������Ч
			//������ѭ��������ѭ���ͻ����ڴ�����ʧ
			//�ڶ���ѭ����ʱ���ֻ����¶���һ��������
			//����:����Ժ�д�ۼ���ͱ�����������ѭ���ⶨ��
			System.out.println(i);
	        sum=sum+i;//sum+=i
		}
		System.out.println(sum);
	}

}
