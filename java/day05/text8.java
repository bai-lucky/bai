package day05;

public class text8 {

	public static void main(String[] args) {
		
		//回文数
		//如果x是一个回文数，打印true,否者打印false
		//回文数：正序和倒序读都是一样的例如121
		int x=12345;
		//定义一个临时变量记录x
		int temp=x;
		int num=0;
		while(x!=0){
			//从右往左获取数字
			int ge=x%10;
			//修改x记录的值
			x/=10;
			//把当前获取的数字拼接到右边
			num=num*10+ge;
		}
		System.out.println(num);
		System.out.println(x);
		System.out.println(num==temp);
		
		
		
		
		
		
		
		/*int x=123;
		//获取个位
		int ge=x%10;
		//十位
		int shi=x/10%10;
		//百位
		int bai=x/100;
		//拼接
		int result=ge*100+shi*10+bai;//result存储计算结果
		System.out.println(result);
		*/

	}

}
