package day07;
import java.util.Random;
public class text7 {

	public static void main(String[] args) {
		//定义一个数组，存入1~5.打乱数组中所有数据
		int arr[]={1,2,3,4,5};
		//索引范围0~4
		for (int i = 0; i < arr.length; i++) {
			//获取数组的随机索引
			Random r=new Random();
		    int number=r.nextInt(arr.length);
		    //拿着随机索引跟i交换
		    int temp=arr[i];
		    arr[i]=arr[number];
		    arr[number]=temp;
		
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
