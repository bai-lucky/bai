package fenzhijiegou;
import java.util.Scanner;
public class text4 {

	public static void main(String[] args) {
		/* 在实际开发中，电影院选座也会使用到if判断。
		      假设某影院售卖了100张票，票的序号为1~100。
		       其中奇数票号坐左侧，偶数票号坐右侧。
                        键盘录入- -个整数表示电影票的票号。
                        根据不同情况，给出不同的提示: .
                         如果票号为奇数，那么打印坐左边
                         如果票号为偶数，那么打印坐右边。
		 * 
		 */
		Scanner ms=new Scanner(System.in);
        System.out.println("请输入你的座位号");
        int p=ms.nextInt();
        //只有当p在0~100之间才是真实有效的票号
        if(p>=0 && p<=100){
        if(p%2==0){
        	System.out.println("你的座位在右边");
        }else{
        	System.out.println("你的座位在左边");
        }
	     }
        }

}
