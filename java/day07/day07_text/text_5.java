package day07_text;

public class text_5 {

	public static void main(String[] args) {
		//����һ���������洢10��ѧ���ĳɼ���
		//���磺{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}��
		//���㲢���ѧ����ƽ���ɼ���
		int[] arr={72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println("ѧ����ƽ����Ϊ��"+avg);

	}

}
