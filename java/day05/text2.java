package day05;
import java.util.Scanner;

public class text2 {

	public static void main(String[] args) {
		// ����¼������������������ա���Ϣ��
		//1-5�����գ�6-7��Ϣ��
		Scanner mc=new Scanner(System.in);
		System.out.println("��������������ڼ�");
		int week=mc.nextInt();
		switch(week){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������");
			break;
		case 6:
		case 7:
			System.out.println("��Ϣ��");
			default:
				System.out.println("û���������");
				break;
		
		}
	}

}
