package day07_text;
import java.util.Scanner;
public class text_6 {

	public static void main(String[] args) {
		//��һ�����飬������ʮ��Ԫ�ش�С������������ {12,14,23,45,66,68,70,77,90,91}��
		//��ͨ������¼��һ���������֡�
		//Ҫ�󣺰����ַ������������У�����һ���µ����飬���������Ԫ�������Ǵ�С�������еġ�

		int arr[]={12,14,23,45,66,68,70,77,90,91};
		Scanner ms=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int a=ms.nextInt();
		    
		int[] brr=new int[11];
		int index=0;//����һ���²�������λ��
		for (int i = 0; i < arr.length; i++) {
			
		     if(arr[i]<=a){
		    	 //�������������С�����������Ԫ��
		    	 brr[i]=arr[i];
		    	 index=i+1;//��¼����һ��λ��
		     }else{
		    	 brr[i+1]=arr[i];
		     }
		     brr[index]=a;
		     for (int j = 0; j < brr.length; j++) {
				
			}
		     System.out.print(brr[i]+" ");
			
		}
		
	}

}
