package fuzhiyunsuan;

import java.util.Scanner;

public class text3 {

	public static void main(String[] args) {
		//����԰��2ֻ�ϻ������طֱ�ͨ������¼���ȡ�����ж�2���ϻ������Ƿ���ͬ
		Scanner taige=new Scanner(System.in);
		System.out.println("�������ϻ�1�����أ�");
		int taige1=taige.nextInt();
		System.out.println("�������ϻ�2�����أ�");
		int taige2=taige.nextInt();
		String resutl=taige1==taige2?"��ͬ":"��ͬ";
		System.out.println(resutl);
		

	}

}
