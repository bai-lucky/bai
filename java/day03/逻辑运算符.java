package fuzhiyunsuan;

public class �߼������ {

	public static void main(String[] args) {

		//1.&�루����)
		//���߶�Ϊ����Ϊ��
		System.out.print(true&true);//true
		System.out.print(false&false);//false
		System.out.print(true&false);//false
		System.out.print(false&true);//false
		//2.|����
		//���߶��Ǽٽ�����Ǽ�(һ������)
		System.out.print(true|true);//true
		System.out.print(false|false);//false
		System.out.print(true|false);//true
		System.out.print(false|true);//true
		//3.���
		//��ͬΪfalse��ͬΪtrue
		System.out.print(true^true);//false
		System.out.print(false^false);//false
		System.out.print(true^false);//true
		System.out.print(false^true);//true
		//4.!��
		//ȡ��
		System.out.println(!false);
		System.out.println(!true);
		//5.��·�߼������  &&  ||
		//����⣬����߱��ʽ��ȷ��������ұ߾Ͳ���������
		int a=10;
		int b=10;
		boolean result=++a<5&&++b<5;
		System.out.print(result);//false
		System.out.print(a);//11
		System.out.print(b);//10
}

}
