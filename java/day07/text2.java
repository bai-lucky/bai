package day07;

public class text2 {

	public static void main(String[] args) {
		// ����һ�����飬�洢1,2,3,4,5,6,7,8,9,10
		//�����õ�ÿһ��Ԫ�أ�ͳ����������һ���ж��ٸ��ܱ�3��������
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int count=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]%3==0){
				count++;
			}
		}
		System.out.print("�������ܱ�3������������"+count+"��");

	}

}
