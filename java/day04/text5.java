package fenzhijiegou;
import java.util.Scanner;

public class text5 {

	public static void main(String[] args) {
		/*
		 根据不同的分数送不同的礼物
		 95-100送自行车
		 90-94送游乐场一日游
		 80-89送变形金刚一个
		 80以下打一顿
		 */
		Scanner fensu=new Scanner(System.in);
		System.out.println("请输入你的分数");
        int p=fensu.nextInt();
        //对异常数值校验
        if(p>=0 && p<=100){
        
        if(p>=95 && p<=100){
        	System.out.println("自行车一辆");
        }else if(p>=90 && p<=94){
        	System.out.println("游乐场一日游");
        }else if(p>=80 && p<=89){
        	System.out.println("变形金刚一个");
        }else{
        	System.out.println("打一顿");
        }
        }else{
        	System.out.println("输入数据不合法");
        }
	}

}
