package day05;
import java.util.Scanner;

public class text1 {

	public static void main(String[] args) {
		Scanner mc=new Scanner(System.in);
		System.out.print("��������������ڼ���");
		int day=mc.nextInt();
		switch(day){
		case 1:
			System.out.print("�ܲ�");
			break;
		case 2:
			System.out.print("��Ӿ");
			break;
		case 3:
			System.out.print("����");
			break;
		case 4:
			System.out.print("���е���");
			break;
		case 5:
			System.out.print("ȭ��");
			break;
		case 6:
			System.out.print("��ɽ");
			break;
		case 7:
			System.out.print("��һ��");
			break;
			default:
			System.out.print("�������");
			break;
			//default��λ�ú�ʡ��
			//1.λ�ã�default��һ��Ҫд�������棬���ǿ���д���κ�λ�ã�һ��д��������
			//2.ʡ��;default����ʡ�ԣ��﷨���������⣬���ǲ���������
		
			
			/*case��͸
			      �������û��дbreak����
			   ִ�����̣�
			      ���Ȼ���С�����еı��ʽ�������ÿһ��ֵ����ƥ�䡣
			      ���ƥ�����ˣ��ͻ�ִ�ж�Ӧ������壬�����ʱ������break����ô��������switch��䡣
			      ���û�з���break����ô����������һ��case������壬һֱ����һ��break���ߴ�����Ϊֹ��
			   ʹ�ó�����
			   ����ж��������ظ��ˣ���ô���ǿ�������case��͸���򻯴��롣   
			*/
			
			
			/*
			 switch��if�ĵ����ָ�ʽ���Ե�ʹ�ó���
			 if�ĵ����ָ�ʽ��һ�����ڶԷ�Χ���ж�
			 switch�������޸������оٳ�����Ȼ����ѡ��һ 
			 */
			
		}

	}

}
