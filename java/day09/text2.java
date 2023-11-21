package day09;

public class text2 {

	public static void main(String[] args) {
		//判断101~200之间有多少个素数，并输出所有素数。
		int count=0;
		//外循环：遍历101-200这个范围，依次得到这个范围内的每一个数字
		for (int i = 101; i <=200; i++) {
			System.out.print(i);
		    boolean flag=true;
		    //内循环：判断当前这个数是否是质数
		for (int j =2; j < i; j++) {
			if(i%j==0){
				flag=false;
				//跳出循环，单层循环
				break;
				
			}
			
		}
		if(flag){
			System.out.println("当前是一个质数");
			count++;
			
		}else{
			System.out.println("当前不是一个质数");
		}
		}
		System.out.print("有"+count+"个质数");

	}

}
