package day07;

public class text6 {

	public static void main(String[] args) {
		//����һ������{1,2,3,4,5}
		//��������Ԫ��
		int[] arr={1,2,3,4,5};
		//2.����ѭ������
		for(int i=0,j=arr.length-1;i<j;i++,j--){
			//��������i����jָ���Ԫ��
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
