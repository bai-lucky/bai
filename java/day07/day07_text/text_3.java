package day07_text;
import java.util.Random;
public class text_3 {

	public static void main(String[] args) {
		//创建一个长度为6的整数数组。
		//请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中
		//然后计算出数组中所有元素的和并打印。
		int[] arr=new int[6];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			Random r=new Random();
			int number=r.nextInt(101);
			arr[i]=number;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
