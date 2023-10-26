package day06;

public class text1 {

	public static void main(String[] args) {
		//逢7过
		//任意一个数字开始报数，当你报的数字包含7或者7的倍数的时候都要说过
		//打印1-100之间满足规则的结果
		int i=1;
		for(i=1;i<=100;i++){
			if(i%7==0 || i/10==7 ||i%10==7){
			System.out.println("过");
			continue;
			}
			System.out.println(i);
		}

	}

}
