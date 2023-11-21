package day09;
import java.util.Scanner;
public class text5 {

	public static void main(String[] args) {
		//在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
		//选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

		int[] arr=getScores();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//2.求数组最大值
		int max=getMax(arr);
		//3.求数组最小值
		int min=getMin(arr);
		//4.求数组的6数的总和
		int sum=getSum(arr);
		//5.（总和-最大值-最小值）/4
		int avg=(sum-max-min)/arr.length-2;
		System.out.println("选手的最终得分为："+avg);

	}

	  //求和
	public static int getSum(int[] arr){
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	//求数组的最大值
	 public static int getMax(int[] arr){
		  int min=arr[0];
		  for (int i = 0; i < arr.length; i++) {
			  if(min<arr[i]){
				  min=arr[i];
		  }
		}
		  return min;
	  }
	 //求数组的最小值
	 public static int getMin(int[] arr){
		  int max=arr[0];
		  for (int i = 0; i < arr.length; i++) {
			  if(max<arr[i]){
				  max=arr[i];
		  }
		}
		  return max;
	  }
	
	 //将键盘录入的数存入到数组中，并判断录入的数是否合理
	public static int[] getScores(){
		int[] scores=new int[6];//动态定义数组
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入评委的打分：");
		for (int i = 0; i < scores.length; ) {
			int score=sc.nextInt();//接收键盘录入的数
			if(score>=0 &&score<=100){
				scores[i]=score;//将键盘录入的数放入数组的索引中
				i++;
			}else{
				System.out.println("成绩超出了范围，请重新录入，当前i为："+i);
			}
		   
		}
		return scores;
	}

}
