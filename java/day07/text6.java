package day07;

public class text6 {

	public static void main(String[] args) {
		//创建一个数组{1,2,3,4,5}
		//交换数组元素
		int[] arr={1,2,3,4,5};
		//2.利用循环交换
		for(int i=0,j=arr.length-1;i<j;i++,j--){
			//交换变量i变量j指向的元素
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
