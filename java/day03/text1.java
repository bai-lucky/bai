
package fuzhiyunsuan;

import java.util.Scanner;
public class text1 {

	public static void main(String[] args) {
		//����¼��2��������ʾ��������Լ��ʱ��ʱ�̶ֳȡ����ֶ�¼��0-10֮�����������¼��������
		//������ʱ�̶ֳȴ���������ʱ�̶ֳȣ������׳ɹ������true���������false��

		//1.����¼�����ǵ�ʱ�ֶ�
		Scanner mc=new Scanner(System.in);
		System.out.println("���������ʱ�̶ֳ�");
		int my=mc.nextInt();
		System.out.println("�����������ʱ�̶ֳ�");
		int she=mc.nextInt();
		
		//2.�����ǵ�ʱ�ֶȽ��жԱ�
		boolean result=my>she;//result�����Ǵ洢��ʾ����ֵ
		//3.��ӡ���
	    System.out.print(result);
				
	}

}
