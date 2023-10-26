package fuzhiyunsuan;

public class 算数运算符 {

	public static void main(String[] args) {
		//需求：使用三元运算符，获取2个数最大值
		
		
		//分析：
		//1.定义2个变量记录整数
		int number1=10;
		int number2=10;
		//2.使用三元运算符获取最大值
		//格式：   关系表达式？表达式1：表达式2；
		//整个三元运算符的结果必须使用
		int max= number1>number2?number1:number2;
		System.out.println(max);
		System.out.println(number1>number2?number1:number2);

	}

}
