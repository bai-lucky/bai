package fuzhiyunsuan;

public class text4 {

	public static void main(String[] args) {
		//寺庙里面里面有3个和尚，已知他们的身高分别为150cm，210cm，165cm，
		//用程序获取他们的最高身高
		int a=150;
		int b=210;
		int c=165;
		int max1=a>b?a:b;
		int max2=c>max1?c:max1;
		System.out.println("身高最高的是："+max2+"cm");
		

	}

}
