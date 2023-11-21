package day09;

public class text4 {

	public static void main(String[] args) {
		//把一个数组的元素复制到另一个数组中去
		//1.定义一个数组
		int[] arr={1,2,3,4,5};
		//2.定义一个新数组
		int[] newarr=new int[arr.length];
		//3.遍历老数组，得到老数组中的每一个元素，然后赋到新数组里面去
		for (int i = 0; i < arr.length; i++) {
			//i 老数组的索引
			//arr[i] 老数组中的每一个元素
			newarr[i]=arr[i];
			
		}
		//4.新数组存满元素
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i]);
		}

	}

}
