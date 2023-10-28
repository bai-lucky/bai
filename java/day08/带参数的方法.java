package day08;

public class 带参数的方法 {

	public static void main(String[] args) {
		//带参数方法定义的格式和调用
		//形参跟实参要一一对应
		getSum(20,40);
		//实参：方法调用中的参数
		

	}
	public static void getSum(int num1,int num2){
		//形参：方法定义中的参数
		int result=num1+num2;
		System.out.print(result);
	}

}
