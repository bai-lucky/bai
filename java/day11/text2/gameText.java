package text2;

public class gameText {

	public static void main(String[] args) {
		//1.������һ����ɫ
		Role r1 = new Role("������",100,'��');
		//2.�����ڶ�����ɫ
		Role r2=new Role("����",100,'��');
		
		//չʾһ�½�ɫ��Ϣ
		r1.shouwRoleINfo();
		r2.shouwRoleINfo();
		
		//3.��ʼ�񶷣��غ�����Ϸ
		while(true){
			r1.attack(r2);
			if(r2.getBlood()==0){
				System.out.println(r1.getName()+"K.O��"+r2.getName());
				break;
			}
			//r2��r1
			 r2.attack(r1);
	            if(r1.getBlood() == 0){
	                System.out.println(r2.getName() + " K.O��" + r1.getName());
	                break;
	            }
		}
	}

	}
