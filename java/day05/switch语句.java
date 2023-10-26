package day05;

public class switch语句 {

	public static void main(String[] args) {
		//兰州拉面 武汉热干面 北京炸酱面 陕西油泼面
		
		//1.定义我想吃的面
		String food="重庆小面";
		//2.拿着这个面利用switch跟4种面比较
		switch(food){
		case "武汉热干面":
			System.out.println("吃武汉热干面");
			break;
		case "兰州拉面":
			System.out.println("吃兰州拉面");
			break;
		case "北京炸酱面":
			System.out.println("吃北京炸酱面");
			break;
		case "陕西油泼面":
			System.out.println("吃陕西油泼面");
			break;
			default:
				System.out.println("吃方便面");
				break;
				
		}
		

	}

}
