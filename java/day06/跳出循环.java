package day06;

public class 跳出循环 {

	public static void main(String[] args) {
		// 1.跳过某一次循环
		for(int i=1;i<=5;i++){
			if(i==3){
				continue;//结束本次循环，继续下一次循环
			}
			System.out.println("小老虎在吃第"+i+"包子");
		}

		//2.跳出整个循环
		for(int a=1;a<=5;a++){
			if(a==3){
				break;//结束整个循环
			}
			System.out.println("小老虎在吃第"+a+"包子");
		}
	}

}
