package day07;
import java.util.Random;
public class text5 {

	public static void main(String[] args) {
		/*需求：生成10个1~100之间的随机数存入数组。
            1.求出所有数据的和
            2.求所有数据的平均数
            3.统计有多少个数据比平均值小*/ 
		
		int[] arr=new int[10];
		//随机存入一个数
		Random r=new Random();
		
		for (int i = 0; i < arr.length; i++) {
			//每循环一次，就会生成一个随机数
			int number=r.nextInt(100)+1;//1~100范围
			//把生成的随机数添加到数组中
			//数组名[索引]=数据；
			arr[i]=number;
		}
		//	1.求和
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			//循环得到每一个元素
			//并把元素加入到sum
			sum=sum+arr[i];
		}
		System.out.println("数组中所有数据的和为："+sum);
		//2.数据的平均数
		int avg=sum/arr.length;
		System.out.println("数组中平均数为："+avg);
		
		//3.统计有多少个数据比平均值小
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<avg){
				count++;
			}
		}
		System.out.println("比平均数小的个数为："+count);
		
		//遍历数组，验证答案
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//+" "中间打印空格间隔数据
			//print和println区别是前者不换行后者换行
		}
	}

}
