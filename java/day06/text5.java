package day06;
import java.util.Random;
public class text5 {

	public static void main(String[] args) {
	//�������һ������Χ7~15
		
		Random r=new Random();
		int a=r.nextInt(9)+7;
		//�ؾ���
		//1.�������ͷβ����ȥһ��ֵ���������Χ����0��ʼ -7  0~8
		//2.β�ͼ�1   8+1=9
		//3.���յĽ�����ټ�����һ����ȥ��ֵ
		System.out.println(a);
	}

}
