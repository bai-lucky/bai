package day10;

public class girlFriend {
	//1.����
	private String name;
	private int age;
	private String gender;
	//private�ؼ���ֻ���ڱ��������������Ĳ���
	
	
	//���ÿһ��˽�л��ĳ�Ա��������Ҫ�ṩget����ȡ����set����ֵ������
	//set����������Ա������ֵ
	//get�����������ṩ��Ա������ֵ
	
	
	
	
	
	
	
	
	
	
	//2.��Ϊ
	public void sleep(){
		System.out.print("Ů������˯��");
	}
	//�����ṩname������
	public String getName() {
		return name;
	}
	//���ã�����Ա����name���и�ֵ
	public void setName(String name) {
		//this�ı����ǣ������������ߵĵ�ֵַ
		//this�ؼ�����������ʾ���ֲ�������ֵ����Ա����
		//��������ڲ������е���set������name��ֵ���ڽ���ֵ��name���ֲ���������ֵ������Ա������
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void eat(){
		System.out.print("Ů�����ڳԷ�");
	}

}
//���Ͻ�JavaBean�࣬��������һ������Ļ�������
