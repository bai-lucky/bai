package day10;

public class girlFriend {
	//1.属性
	private String name;
	private int age;
	private String gender;
	//private关键字只能在本类里面用其他的不行
	
	
	//针对每一个私有化的成员变量，都要提供get（获取）和set（赋值）方法
	//set方法，给成员变量赋值
	//get方法，对外提供成员变量的值
	
	
	
	
	
	
	
	
	
	
	//2.行为
	public void sleep(){
		System.out.print("女朋友在睡觉");
	}
	//对外提供name的属性
	public String getName() {
		return name;
	}
	//作用：给成员变量name进行赋值
	public void setName(String name) {
		//this的本质是：代表方法调用者的地址值
		//this关键字是用来表示将局部变量的值给成员变量
		//这里就是在测试类中调用set方法给name赋值，在将赋值的name（局部变量）赋值给（成员变量）
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
		System.out.print("女朋友在吃饭");
	}

}
//以上叫JavaBean类，用于描述一个事物的基本特征
