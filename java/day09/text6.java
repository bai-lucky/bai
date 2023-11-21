package day09;
import java.util.Scanner;
public class text6 {

	public static void main(String[] args) {
		//某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
     //规则如下:先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。

		int[] word=passWord();
		for (int i = 0; i < word.length; i++) {
			word[i]=(word[i]+5)%10;
		}
		for (int i=0,j=word.length-1; i <j; i++,j--) {
			//交换变量i与j指向的值
			int temp=word[i];
			word[i]=word[j];
			word[j]=temp;
		}
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]+" ");
		}
	}
	
	
	
	//键盘录入输入的数据，并判断是否合理
	public static int[] passWord(){
		int[] arr=new int[4];//定义动态数组
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入密码为：");
		for (int i = 0; i < arr.length;) {
			int pass=sc.nextInt();//定义一个变量pass来接受键盘录入的数
			if(pass<10 && pass>=0){
				arr[i]=pass;
				i++;
			}else{
				System.out.println("请重新输入密码："+i);
			}
      
		}
		return arr;
		
	}

}
