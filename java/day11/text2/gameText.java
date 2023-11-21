package text2;

public class gameText {

	public static void main(String[] args) {
		//1.创建第一个角色
		Role r1 = new Role("奥特曼",100,'男');
		//2.创建第二个角色
		Role r2=new Role("怪兽",100,'男');
		
		//展示一下角色信息
		r1.shouwRoleINfo();
		r2.shouwRoleINfo();
		
		//3.开始格斗，回合制游戏
		while(true){
			r1.attack(r2);
			if(r2.getBlood()==0){
				System.out.println(r1.getName()+"K.O了"+r2.getName());
				break;
			}
			//r2打r1
			 r2.attack(r1);
	            if(r1.getBlood() == 0){
	                System.out.println(r2.getName() + " K.O了" + r1.getName());
	                break;
	            }
		}
	}

	}
