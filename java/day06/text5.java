package day06;
import java.util.Random;
public class text5 {

	public static void main(String[] args) {
	//随机生成一个数范围7~15
		
		Random r=new Random();
		int a=r.nextInt(9)+7;
		//秘诀：
		//1.让这个数头尾都减去一个值，让这个范围都从0开始 -7  0~8
		//2.尾巴加1   8+1=9
		//3.最终的结果，再加上上一步减去的值
		System.out.println(a);
	}

}
