package day07_text;

public class text_5 {

	public static void main(String[] args) {
		//定义一个数组来存储10个学生的成绩，
		//例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。
		//计算并输出学生的平均成绩。
		int[] arr={72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println("学生的平均分为："+avg);

	}

}
