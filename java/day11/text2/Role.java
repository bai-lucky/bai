package text2;

import java.util.Random;

public class Role {
	//����Ϸ��ÿ����Ϸ��ɫ��������Ѫ����������ͬ����ѡ�������ʱ��new�����ʱ�򣩣���Щ��Ϣ��Ӧ�ñ�ȷ�������� 

	private String name;
	private int blood;
	private char gender;
	private String face;
	
	String[] boyfaces= {"��������","��������","��òӢ��","��ٶ���","��òƽƽ","һ����Ϳ","��Ŀ����"};
	String[] girlfaces ={"��ۼ����","��������","��������","��Ľ���","��òƽƽ","��ò��ª","�Ҳ��̶�"};
	
	//attack ����������
    String[] attacks_desc={
    "%sʹ����һ�С����Ķ�����ת���Է������һ����%s���ĵ���̨Ѩ��ȥ��",
    "%sʹ����һ�С��ο�̽צ�������������԰���б���Ϊץ����%s��",
    "%s���һ���������·���һ�С�����׹�ء�������%s˫�ȡ�",
    "%s�������ƣ�һ˲�����ı��Ѫ�죬һʽ�������ס�������%s��",
    "%s���ַ������ָ�����һ�С�û�����������ʵʵ�Ĵ���%s��",
    "%s�ϲ������������У�һ�С���������������������%s��"
    };

                             // injured ����������
    String[] injureds_desc={
    "���%s���˰벽����������",
    "�����%s���һ������",
    "���һ�����У�%sʹ��������",
    "���%sʹ����ƺ���һ������Ȼ���˵�����",
    "���%sҡҡ�λΣ�һ��ˤ���ڵ�",
    "���%s��ɫһ�±�òҰף������˺ü���",
    "������䡻��һ����%s������Ѫ�������",
    "���%sһ���ҽУ���̲�����������ȥ"
    };
	
	
	//�ղ�
	public Role(){
	
	}
	//ȫ��
	public Role(String name,int blood,char gender){
		this.name=name;
		this.blood=blood;
		this.gender=gender;
		//�������
		setFace(gender);
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
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getFace() {
		return face;
	}
	public void setFace(char gender) {
		//�����������
		Random r=new Random();
		
		if(gender=='��'){
			//��boyfaces�����������
			int index=r.nextInt(boyfaces.length);
			this.face=boyfaces[index];
		}else if(gender=='Ů'){
			//��girlfaces�����������
			int index=r.nextInt(girlfaces.length);
			this.face=girlfaces[index];
		}else{
			this.face="��Ŀȫ��";
		}
		this.face = face;
	}
	public void attack(Role role){
		Random r=new Random();
		int index=r.nextInt(attacks_desc.length);
		String KunFu=attacks_desc[index];
		
		//���һ��������Ч��
		System.out.printf(KunFu,this.getName(),role.getName());
		
		
		
		//������ɵ��˺�1~20
		
		int hurt=r.nextInt(20)+1;
		
		//�޸�һ�°����˵�Ѫ��
		//ʣ���Ѫ��
		int remainBlood=role.getBlood()-hurt;
		//��Ԫ���������ʣ��Ѫ����һ����֤�����Ϊ�����˾͸�Ϊ0
		remainBlood=remainBlood<0?0:remainBlood;
		//�޸�һ�°����˵�Ѫ��
		role.setBlood(remainBlood);
			
		//���˵�����
		//���˵�����
        //Ѫ��> 90 0����������
        //80 ~  90  1����������
        //70 ~  80  2����������
        //60 ~  70  3����������
        //40 ~  60  4����������
        //20 ~  40  5����������
        //10 ~  20  6����������
        //С��10��   7����������
        if (remainBlood> 90) {
            System.out.printf(injureds_desc[0], role.getName());
        }else if(remainBlood > 80 && remainBlood <= 90){
            System.out.printf(injureds_desc[1], role.getName());
        }else if(remainBlood > 70 && remainBlood <= 80){
            System.out.printf(injureds_desc[2], role.getName());
        }else if(remainBlood > 60 && remainBlood <= 70){
            System.out.printf(injureds_desc[3], role.getName());
        }else if(remainBlood > 40 && remainBlood <= 60){
            System.out.printf(injureds_desc[4], role.getName());
        }else if(remainBlood > 20 && remainBlood <= 40){
            System.out.printf(injureds_desc[5], role.getName());
        }else if(remainBlood > 10 && remainBlood <= 20){
            System.out.printf(injureds_desc[6], role.getName());
        }else{
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();
	
	}
	public void shouwRoleINfo(){
		System.out.println("����Ϊ��"+getName());
		System.out.println("Ѫ��Ϊ��"+getBlood());
		System.out.println("�Ա�Ϊ��"+getGender());
		System.out.println("����Ϊ��"+getFace());
	}
	
	

}
