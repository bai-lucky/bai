package day09;
import java.util.Scanner;
public class text6 {

	public static void main(String[] args) {
		//ĳϵͳ���������루����0��������1983�����ü��ܷ�ʽ���д��䡣
     //��������:�ȵõ�ÿλ����Ȼ��ÿλ��������5 , �ٶ�10���࣬����������ַ�ת���õ�һ��������

		int[] word=passWord();
		for (int i = 0; i < word.length; i++) {
			word[i]=(word[i]+5)%10;
		}
		for (int i=0,j=word.length-1; i <j; i++,j--) {
			//��������i��jָ���ֵ
			int temp=word[i];
			word[i]=word[j];
			word[j]=temp;
		}
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]+" ");
		}
	}
	
	
	
	//����¼����������ݣ����ж��Ƿ����
	public static int[] passWord(){
		int[] arr=new int[4];//���嶯̬����
		Scanner sc=new Scanner(System.in);
		System.out.println("����������Ϊ��");
		for (int i = 0; i < arr.length;) {
			int pass=sc.nextInt();//����һ������pass�����ܼ���¼�����
			if(pass<10 && pass>=0){
				arr[i]=pass;
				i++;
			}else{
				System.out.println("�������������룺"+i);
			}
      
		}
		return arr;
		
	}

}
