package fuzhiyunsuan;

public class 逻辑运算符 {

	public static void main(String[] args) {

		//1.&与（并且)
		//两边都为真结果为真
		System.out.print(true&true);//true
		System.out.print(false&false);//false
		System.out.print(true&false);//false
		System.out.print(false&true);//false
		//2.|或者
		//两边都是假结果才是假(一真则真)
		System.out.print(true|true);//true
		System.out.print(false|false);//false
		System.out.print(true|false);//true
		System.out.print(false|true);//true
		//3.异或
		//相同为false不同为true
		System.out.print(true^true);//false
		System.out.print(false^false);//false
		System.out.print(true^false);//true
		System.out.print(false^true);//true
		//4.!非
		//取反
		System.out.println(!false);
		System.out.println(!true);
		//5.短路逻辑运算符  &&  ||
		//简单理解，当左边表达式能确定结果，右边就不参与运行
		int a=10;
		int b=10;
		boolean result=++a<5&&++b<5;
		System.out.print(result);//false
		System.out.print(a);//11
		System.out.print(b);//10
}

}
