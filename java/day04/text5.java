package fenzhijiegou;
import java.util.Scanner;

public class text5 {

	public static void main(String[] args) {
		/*
		 ���ݲ�ͬ�ķ����Ͳ�ͬ������
		 95-100�����г�
		 90-94�����ֳ�һ����
		 80-89�ͱ��ν��һ��
		 80���´�һ��
		 */
		Scanner fensu=new Scanner(System.in);
		System.out.println("��������ķ���");
        int p=fensu.nextInt();
        //���쳣��ֵУ��
        if(p>=0 && p<=100){
        
        if(p>=95 && p<=100){
        	System.out.println("���г�һ��");
        }else if(p>=90 && p<=94){
        	System.out.println("���ֳ�һ����");
        }else if(p>=80 && p<=89){
        	System.out.println("���ν��һ��");
        }else{
        	System.out.println("��һ��");
        }
        }else{
        	System.out.println("�������ݲ��Ϸ�");
        }
	}

}
