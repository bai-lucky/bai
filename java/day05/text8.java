package day05;

public class text8 {

	public static void main(String[] args) {
		
		//������
		//���x��һ������������ӡtrue,���ߴ�ӡfalse
		//������������͵��������һ��������121
		int x=12345;
		//����һ����ʱ������¼x
		int temp=x;
		int num=0;
		while(x!=0){
			//���������ȡ����
			int ge=x%10;
			//�޸�x��¼��ֵ
			x/=10;
			//�ѵ�ǰ��ȡ������ƴ�ӵ��ұ�
			num=num*10+ge;
		}
		System.out.println(num);
		System.out.println(x);
		System.out.println(num==temp);
		
		
		
		
		
		
		
		/*int x=123;
		//��ȡ��λ
		int ge=x%10;
		//ʮλ
		int shi=x/10%10;
		//��λ
		int bai=x/100;
		//ƴ��
		int result=ge*100+shi*10+bai;//result�洢������
		System.out.println(result);
		*/

	}

}
