package fenzhijiegou;
import java.util.Scanner;

public class text6 {

	public static void main(String[] args) {
		/*
		 在实际开发中，多种情况判断时，会用到if的第三种格式:需求:
                    商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
                    假设商品总价为1000。键盘录入会员级别，并计算出实际支付的钱。
                      会员1级:打9折。
                       会员2级:打8折。
                           会员3级:打7折。
                              会员:不打折，要打也是打骨折。
		 */
		int price=1000;
		Scanner fensu=new Scanner(System.in);
		System.out.println("请输入会员等级");
        int a=fensu.nextInt();
        if(a>=1 && a<=3){
        if(a==1){
        	System.out.println("您应该付："+price*0.9);
        }else if(a==2){
        	System.out.println("您应该付："+price*0.8);
        }else{
        	System.out.println("您应该付："+price*0.7);
        }
       }else{
        	System.out.println("您不是会员应支付："+price);
        }

	}

}
