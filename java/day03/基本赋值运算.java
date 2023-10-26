package fuzhiyunsuan;

public class 基本赋值运算 {

	public static void main(String[] args) {
		//+=
		//规则：将左右两边的值进行相加，然后赋值给左边
		int a=10;
		int b=20;
		a+=b;
		//把a+b的值赋值给a
		//等同于a=(int)(a+b);
		System.out.print(a);//30
		System.out.print(b);//20
		
		//细节
		//+= -= *= %=底层隐藏了一个强制转换
		short s=1;
		//把左边和右边进行相加，结果得到2，在赋值给变量
		s+=1;
		//等同于s=（short）(s+1)；
		System.out.print(s);
	}

}
