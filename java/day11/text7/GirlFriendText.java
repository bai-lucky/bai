package text7;

public class GirlFriendText {

	public static void main(String[] args) {
		//��������
		GirlFriend[] arr=new GirlFriend[4];
		//�����ĸ�����
		GirlFriend g1=new GirlFriend("С��",18,"������","����ë��");
		GirlFriend g2=new GirlFriend("С��",19,"����","�ﳵ");
		GirlFriend g3=new GirlFriend("С��",20,"����","��С˵");
		GirlFriend g4=new GirlFriend("С��",21,"��ʦ","����");
		
		arr[0]=g1;
		arr[1]=g2;
		arr[2]=g3;
		arr[3]=g4;
		//���
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			GirlFriend gf=arr[i];
			sum=sum+gf.getAge();
		}
		//��ƽ��ֵ
		int avg=sum/arr.length;
		//ͳ�������ƽ��ֵ�͵��м�������ӡ���ǵ���Ϣ
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			GirlFriend gf=arr[i];
			if(gf.getAge()<avg){
				System.out.println(gf.getName()+","+gf.getAge()+","+gf.getGender()+","+gf.getHobby());
				count++;
			
		}
			
		}
		System.out.println(count+"��");

	}

}
