package text1;

import java.util.Random;

public class Role {
	//����Ϸ��ÿ����Ϸ��ɫ��������Ѫ����������ͬ����ѡ�������ʱ��new�����ʱ�򣩣���Щ��Ϣ��Ӧ�ñ�ȷ�������� 

	private String name;
	private int blood;
	//�ղ�
	public Role(){
	
	}
	//ȫ��
	public Role(String name,int blood){
		this.name=name;
		this.blood=blood;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	//����һ���������ڹ�������
	//˼����˭����˭��
	//�����ĵ�����ȥ��������
	
	public void attack(Role role){
		//������ɵ��˺�1~20
		Random r=new Random();
		int hurt=r.nextInt(20)+1;
		
		//�޸�һ�°����˵�Ѫ��
		//ʣ���Ѫ��
		int remainBlood=role.getBlood()-hurt;
		//��Ԫ���������ʣ��Ѫ����һ����֤�����Ϊ�����˾͸�Ϊ0
		remainBlood=remainBlood<0?0:remainBlood;
		//�޸�һ�°����˵�Ѫ��
		role.setBlood(remainBlood);
			
		
		//this��ʾ�����ĵ�����
	System.out.println(this.getName() + "����ȭͷ������" + role.getName() + "һ�£�" +
            "�����" + hurt + "���˺���" + role.getName() + "��ʣ����" + remainBlood + "��Ѫ");
	}
	
	
	

}
