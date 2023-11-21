package day09;

import java.util.Random;

public class text7 {

	public static void main(String[] args) {
		//一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
		//请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
		//打印效果如下：（随机顺序，不一定是下面的顺序）

		
		//定义一个数组表示奖池
		int[] arr={2,588,888,1000,10000};
		//2.定义新数组存储抽取的结果
		int[] newArr=new int[arr.length];
		//3.抽奖
		Random r=new Random();
		//因为有五个奖项所以要抽5次
		for (int i = 0; i < 5;) {
			//获取随机索引
			int randomIndex=r.nextInt(arr.length);
			//获取奖项
			int prize=arr[randomIndex];
			//判断当前的奖项是否存在
			boolean flag=contains(newArr,prize);
			if(!flag){
				//把当前抽到的奖项添加到newArr中、
				newArr[i]=prize;
				//添加完毕后，移动索引
				i++;
			}
		}
		//遍历newArr
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);	
		}
	}
	//判断prize在数组中是否存在
	//存在输出 true
	//不存在输出false
	public static boolean contains(int[] arr,int prize){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==prize){
				return true;
			}
		}
		return false;
	}

}
