package day09;

public class text2 {

	public static void main(String[] args) {
		//�ж�101~200֮���ж��ٸ����������������������
		int count=0;
		//��ѭ��������101-200�����Χ�����εõ������Χ�ڵ�ÿһ������
		for (int i = 101; i <=200; i++) {
			System.out.print(i);
		    boolean flag=true;
		    //��ѭ�����жϵ�ǰ������Ƿ�������
		for (int j =2; j < i; j++) {
			if(i%j==0){
				flag=false;
				//����ѭ��������ѭ��
				break;
				
			}
			
		}
		if(flag){
			System.out.println("��ǰ��һ������");
			count++;
			
		}else{
			System.out.println("��ǰ����һ������");
		}
		}
		System.out.print("��"+count+"������");

	}

}
