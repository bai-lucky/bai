package day07;
import java.util.Random;
public class text7 {

	public static void main(String[] args) {
		//����һ�����飬����1~5.������������������
		int arr[]={1,2,3,4,5};
		//������Χ0~4
		for (int i = 0; i < arr.length; i++) {
			//��ȡ������������
			Random r=new Random();
		    int number=r.nextInt(arr.length);
		    //�������������i����
		    int temp=arr[i];
		    arr[i]=arr[number];
		    arr[number]=temp;
		
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
