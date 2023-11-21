package day09;
import java.util.Random;
public class text3 {

	public static void main(String[] args) {
		/*定义方法实现随机产生一个5位的验证码
​	        长度为5
​	        前四位是大写字母或者小写字母
​	         最后一位是数字*/
		
		 //方法：
        //在以后如果我们要在一堆没有什么规律的数据中随机抽取
        //可以先把这些数据放到数组当中
        //再随机抽取一个索引
		
		//分析：大写字母小写字母放到数组当中
		char[] chs=new char[52];
		for (int i = 0; i < chs.length; i++) {
			//ASCII码    97---a
			if(i<=25){
				chs[i]=(char)(97+i);
			}else{
				//添加大写 A--65
				chs[i]=(char)(65+i-26);
			}
			
			
		}
		/*for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i]+" ");
		}*/
		//定义一个字符串的变量记录结果
		String result="";
		//随机抽取4次
		//利用随机索引获取一个元素
		Random r=new Random();
		for (int i = 0; i <4; i++) {
			int randomIndex=r.nextInt(51);
			//System.out.print(chs[randomIndex]);
			result=result+chs[randomIndex];
		}
		int number=r.nextInt(10);
		//生成最终的结果
		result=result+number;
		System.out.print(result);
		

	}

}
