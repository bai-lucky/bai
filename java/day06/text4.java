package day06;
import java.util.Random;//���� random���������
public class text4 {

	public static void main(String[] args) {
		//
		Random r=new Random();
		//�жϼ��ɣ���С�����У���д�ĵ�������������ķ�Χ
		//��Χ�Ǵ�0��ʼһֱ���������һ����
		//�ھ�����ͷ����β�����󲻰���
		int number=r.nextInt(100);//0~99
		System.out.println(number);
	}

}
