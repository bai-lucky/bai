package day05;

public class text5 {

	public static void main(String[] args) {
		//1.求1-100的和
		int sum=0;
		int i=1;
		for(i=1;i<=100;i++){
			//求和的变量不能定义在循环里面，因为变量只在所属的大括号中有效
			//如果我们把变量定义在循环里面，那么当前变量只在本次循环中有效
			//当本次循环结束后，循环就会在内存中消失
			//第二次循环的时候又会重新定义一个变量。
			//结论:如果以后写累加求和变量，建议在循环外定义
			System.out.println(i);
	        sum=sum+i;//sum+=i
		}
		System.out.println(sum);
	}

}
