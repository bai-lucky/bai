package day07;
import java.util.Random;
public class text5 {

	public static void main(String[] args) {
		/*��������10��1~100֮���������������顣
            1.����������ݵĺ�
            2.���������ݵ�ƽ����
            3.ͳ���ж��ٸ����ݱ�ƽ��ֵС*/ 
		
		int[] arr=new int[10];
		//�������һ����
		Random r=new Random();
		
		for (int i = 0; i < arr.length; i++) {
			//ÿѭ��һ�Σ��ͻ�����һ�������
			int number=r.nextInt(100)+1;//1~100��Χ
			//�����ɵ��������ӵ�������
			//������[����]=���ݣ�
			arr[i]=number;
		}
		//	1.���
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			//ѭ���õ�ÿһ��Ԫ��
			//����Ԫ�ؼ��뵽sum
			sum=sum+arr[i];
		}
		System.out.println("�������������ݵĺ�Ϊ��"+sum);
		//2.���ݵ�ƽ����
		int avg=sum/arr.length;
		System.out.println("������ƽ����Ϊ��"+avg);
		
		//3.ͳ���ж��ٸ����ݱ�ƽ��ֵС
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<avg){
				count++;
			}
		}
		System.out.println("��ƽ����С�ĸ���Ϊ��"+count);
		
		//�������飬��֤��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//+" "�м��ӡ�ո�������
			//print��println������ǰ�߲����к��߻���
		}
	}

}
