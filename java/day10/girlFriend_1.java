package day10;

public class girlFriend_1 {

	public static void main(String[] args) {
		//创建对象
		girlFriend wsm=new girlFriend();
		//赋值
		wsm.setName("小王");
		wsm.setAge(18);
		wsm.setGender("小女孩");
		System.out.println(wsm.getAge());
		System.out.println(wsm.getName());
		System.out.println(wsm.getGender());
		
		wsm.eat();
		wsm.sleep();

			

	}

}
