package day06;

public class text1 {

	public static void main(String[] args) {
		//��7��
		//����һ�����ֿ�ʼ���������㱨�����ְ���7����7�ı�����ʱ��Ҫ˵��
		//��ӡ1-100֮���������Ľ��
		int i=1;
		for(i=1;i<=100;i++){
			if(i%7==0 || i/10==7 ||i%10==7){
			System.out.println("��");
			continue;
			}
			System.out.println(i);
		}

	}

}
