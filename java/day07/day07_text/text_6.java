package day07_text;
import java.util.Scanner;
public class text_6 {

	public static void main(String[] args) {
		//有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
		//再通过键盘录入一个整数数字。
		//要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。

		int arr[]={12,14,23,45,66,68,70,77,90,91};
		Scanner ms=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int a=ms.nextInt();
		    
		int[] brr=new int[11];
		int index=0;//定义一个新插入数的位置
		for (int i = 0; i < arr.length; i++) {
			
		     if(arr[i]<=a){
		    	 //如果插入的这个数小于数组中这个元素
		    	 brr[i]=arr[i];
		    	 index=i+1;//记录后面一个位置
		     }else{
		    	 brr[i+1]=arr[i];
		     }
		     brr[index]=a;
		     for (int j = 0; j < brr.length; j++) {
				
			}
		     System.out.print(brr[i]+" ");
			
		}
		
	}

}
