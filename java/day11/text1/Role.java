package text1;

import java.util.Random;

public class Role {
	//格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些信息就应该被确定下来。 

	private String name;
	private int blood;
	//空参
	public Role(){
	
	}
	//全参
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
	//定义一个方法用于攻击别人
	//思考：谁攻击谁？
	//方法的调用者去攻击参数
	
	public void attack(Role role){
		//计算造成的伤害1~20
		Random r=new Random();
		int hurt=r.nextInt(20)+1;
		
		//修改一下挨打人的血量
		//剩余的血量
		int remainBlood=role.getBlood()-hurt;
		//三元运算符，对剩余血量做一个验证，如果为负数了就改为0
		remainBlood=remainBlood<0?0:remainBlood;
		//修改一下挨打人的血量
		role.setBlood(remainBlood);
			
		
		//this表示方法的调用者
	System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
            "造成了" + hurt + "点伤害，" + role.getName() + "还剩下了" + remainBlood + "点血");
	}
	
	
	

}
