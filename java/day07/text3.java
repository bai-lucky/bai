package day07;

public class text3 {

	public static void main(String[] args) {
		//定义一个数组，存储1,2,3,4,5,6,7,8,9,10
		//遍历得到每一个元素
		//1.如果是奇数就将当前的数字扩大2倍
		//2.如果是偶数则缩小到二分之一
		int[] all={1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < all.length; i++) {
			if(all[i]%2==0){
				all[i]=all[i]/2;
			}else{
				all[i]=2*all[i];
			}
			
		}
		//一个循环尽量只做一件事情
		for (int i = 0; i < all.length; i++) {
			System.out.print(all[i]);
		}

	}

}
