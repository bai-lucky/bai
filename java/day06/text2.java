package day06;
import java.util.Scanner;
public class text2 {

	public static void main(String[] args) {
		//����¼��һ�����ڵ���2������x,������x������ƽ������
		//���ֻ�����������֣�С��������
		Scanner ms=new Scanner(System.in);
		System.out.println("������һ������");
		int a=ms.nextInt();
		for(int i=1;i<=a;i++){
			if(i*i==a){
				System.out.println(i+"����"+a+"��ƽ����");
				break;//һ���ҵ���ֹͣѭ��������Ͳ��ý���
			}else if(i*i>a){
				System.out.println((i-1)+"����"+a+"��ƽ����");
				break;
			}
		}
	}

}
