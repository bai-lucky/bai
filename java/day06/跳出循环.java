package day06;

public class ����ѭ�� {

	public static void main(String[] args) {
		// 1.����ĳһ��ѭ��
		for(int i=1;i<=5;i++){
			if(i==3){
				continue;//��������ѭ����������һ��ѭ��
			}
			System.out.println("С�ϻ��ڳԵ�"+i+"����");
		}

		//2.��������ѭ��
		for(int a=1;a<=5;a++){
			if(a==3){
				break;//��������ѭ��
			}
			System.out.println("С�ϻ��ڳԵ�"+a+"����");
		}
	}

}
