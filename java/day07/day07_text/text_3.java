package day07_text;
import java.util.Random;
public class text_3 {

	public static void main(String[] args) {
		//����һ������Ϊ6���������顣
		//���д���룬�����������0��������-100����������֮���������ŵ�������
		//Ȼ����������������Ԫ�صĺͲ���ӡ��
		int[] arr=new int[6];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			Random r=new Random();
			int number=r.nextInt(101);
			arr[i]=number;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
