package day05;

public class text6 {

	public static void main(String[] args) {
		// 求1-100的偶数和
		int sum=0;
		int i=0;
		for(i=0;i<=100;i++){
			if(i%2==0){
				sum+=i;
				
			}
		}
		System.out.println(sum);

	}

}
