package day05;

public class whileѭ�� {

	public static void main(String[] args) {
		/*��ʽ
		 * while(�����ж����){
		  ѭ�������
		  �����������
		 }
		 */
		//����whileѭ����ӡ1-100
		int i=1;
		while(i<=100){
			i++;
		}
		//������߷���������壨8844.43��=8844430���ף�����������һ���㹻���ֽ���Ϊ0.1����
		//�����۵����ٴ��ܴﵽ���������߶ȣ�
		
		double paper=0.1;//ֽ�ŵĺ��
		double hingt=8844430;//ɽ��ĸ߶�
		int count=0;//ͳ�ƴ���
		while(paper<hingt){
			paper=paper*2;//�۵��ĺ��
			count++;
			i++;
		}
		System.out.println(count);

	}

}
