package day09;
import java.util.Scanner;
public class text5 {

	public static void main(String[] args) {
		//�ڳ�������У���6����ί��ѡ�ִ�֣�������Χ��[0 - 100]֮���������
		//ѡ�ֵ����÷�Ϊ��ȥ����߷֡���ͷֺ��4����ί��ƽ���֣�������������̲������ѡ�ֵĵ÷֡�

		int[] arr=getScores();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//2.���������ֵ
		int max=getMax(arr);
		//3.��������Сֵ
		int min=getMin(arr);
		//4.�������6�����ܺ�
		int sum=getSum(arr);
		//5.���ܺ�-���ֵ-��Сֵ��/4
		int avg=(sum-max-min)/arr.length-2;
		System.out.println("ѡ�ֵ����յ÷�Ϊ��"+avg);

	}

	  //���
	public static int getSum(int[] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	//����������ֵ
	 public static int getMax(int[] arr){
		  int min=arr[0];
		  for (int i = 0; i < arr.length; i++) {
			  if(min<arr[i]){
				  min=arr[i];
		  }
		}
		  return min;
	  }
	 //���������Сֵ
	 public static int getMin(int[] arr){
		  int max=arr[0];
		  for (int i = 0; i < arr.length; i++) {
			  if(max<arr[i]){
				  max=arr[i];
		  }
		}
		  return max;
	  }
	
	 //������¼��������뵽�����У����ж�¼������Ƿ����
	public static int[] getScores(){
		int[] scores=new int[6];//��̬��������
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ί�Ĵ�֣�");
		for (int i = 0; i < scores.length; ) {
			int score=sc.nextInt();//���ռ���¼�����
			if(score>=0 &&score<=100){
				scores[i]=score;//������¼��������������������
				i++;
			}else{
				System.out.println("�ɼ������˷�Χ��������¼�룬��ǰiΪ��"+i);
			}
		   
		}
		return scores;
	}

}
