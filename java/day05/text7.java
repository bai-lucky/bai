package day05;
import java.util.Scanner;
public class text7 {

	public static void main(String[] args) {
		// ����¼��2��������ʾһ����Χ��
		//ͳ���������Χ�ڼ��ܱ�3�������ܱ�5���������ж��ٸ�
		Scanner ms=new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int a=ms.nextInt();
		System.out.println("������ڶ������֣�");
		int b=ms.nextInt();
		int count=0;
		
		
		for(int i=a;i<=b;i++){
			if(i%3==0 &&  i%5==0){
				count++;
			}
			
		}
		System.out.println(count);
	}
		

	}


