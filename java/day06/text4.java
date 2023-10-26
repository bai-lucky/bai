package day06;
import java.util.Random;//导包 random生成随机数
public class text4 {

	public static void main(String[] args) {
		//
		Random r=new Random();
		//判断技巧，在小括号中，书写的的是生成随机数的范围
		//范围是从0开始一直到这个数减一结束
		//口诀：包头不包尾，包左不包右
		int number=r.nextInt(100);//0~99
		System.out.println(number);
	}

}
